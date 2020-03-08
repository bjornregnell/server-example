def ServerPort = 9000
def ServerIP   = "0.0.0.0"
def now = new java.util.Date

@main def run() =
  MyServer.start(port = ServerPort, host = ServerIP)

object MyServer extends WebServer:
  def log(msg: String): Unit = println(s"MyServer @ $now: $msg")

  override def routes =
    import akka.http.scaladsl.server.Directives._
    import akka.http.scaladsl.server.StandardRoute

    path("hello") { extractClientIP { ip =>
      val addr = ip.toOption.map(_.getHostAddress.toString).getOrElse("unknown")
      get { log(s"/hello"); reply(html.helloPage(msg = s"hello from ip=$addr")) } 
    } }