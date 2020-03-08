object html:
  def page(body: String, title: String, reloadEverySeconds: Int = 0): String = 
    s"""
    |<!DOCTYPE html><html><head><meta charset="UTF-8">
    |  ${if reloadEverySeconds > 0 then refresh(reloadEverySeconds) else ""}
    |  <title>$title</title>
    |  <style>${css.styles}</style>
    |</head>
    |<body>$body</body>
    |</html>
    |""".stripMargin

  def refresh(reloadEverySeconds: Int): String =
    s"""<meta http-equiv="refresh" content="$reloadEverySeconds" />"""

  def h1(heading: String): String = s"<h1>$heading</h1>"

  def nl2br(soup: String): String = soup.replaceAllLiterally("\n"," <br>\n")    

  def helloPage(msg: String = "Hello world!"): String = 
    s"""
    |<!DOCTYPE html>
    |<html>
    |  <head>
    |    <title>MyServer hello page</title>
    |    <style>
    |      body {background-color: pink;}
    |      h1 {color: purple;}
    |      p {color: green;}
    |    </style>
    |  </head>
    |  <body>
    |    <h1>$msg</h1>
    |  </body>
    |</html>""".stripMargin

  def link(url: String, text: String = "here"): String = s"""<a href="$url">$text</a>"""

  def boldIf(cond: Boolean)(s: String) = if cond then s"<b>$s</b>" else s
