object css:
  def styles = """
    |html { -webkit-font-smoothing: antialiased; }
    |body {
    |    background-color: pink;
    |    font-size: 28px;
    |    line-height: 1.2;
    |    font-family: "Lucida Console", Monaco, monospace;
    |    margin: 20px 20px;
    |}
    |.button {
    |    background-color: #4CAF50;
    |    border: 8px solid #444;
    |    color: pink;
    |    padding: 20px 80px;
    |    text-align: center;
    |    text-decoration: none;
    |    display: inline-block;
    |    font-size: 150%;
    |    font-weight:bold;
    |    margin: 10px 2px;
    |    cursor: pointer;
    |    font-family: "Lucida Console", Monaco, monospace;
    |}
    |.smallinput {
    |    width: 180px;
    |    font-size: 28px;
    |    margin: 5px 5px;
    |}
    |.mediuminput {
    |    width: 500px;
    |    font-size: 150%;
    |    margin: 2px 2px;
    |}
    |.radio-toolbar input[type="radio"] {
    |  opacity: 0;
    |  position: fixed;
    |  width: 0;
    |}
    |.radio-toolbar label {
    |  display: inline-block;
    |  background-color:  #ddd;
    |  font-weight:300;
    |  padding: 10px 20px;
    |  font-size: 32px;
    |  border: 8px solid #444;
    |  border-radius: 38px;
    |}
    |.radio-toolbar input[type="radio"]:checked + label {
    |  background-color: #fcba03;
    |  font-weight:900;
    |  border-color: #c700d1;
    |}
    |.radio-toolbar input[type="radio"]:focus + label {
    |  border: 8px dashed #444;
    |}
    """.stripMargin