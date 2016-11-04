<#macro layout>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="viewport" content="width=device-width, user-scalable=no" />

    <!-- Bootstrap -->
    <title>KLibrary</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs-3.3.6/dt-1.10.12/datatables.min.css">
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/styles.css" rel="stylesheet">
  </head>
  <body>

    <div class="pre-nav">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <img height="60px" src="http://i.imgur.com/c2ujd7K.png">
          </div>
        </div>
      </div>
    </div>

    <nav class="navbar navbar-inverse navbar-static-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="/book/list">Books</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <#nested/>

    </div><!-- /.container -->
    <script src="https://code.jquery.com/jquery-3.1.0.js"></script>
    <script src="https://cdn.datatables.net/v/bs-3.3.6/jq-2.2.3/dt-1.10.12/datatables.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="/assets/js/Booklist.js"></script>
  </body>
</html>
</#macro>
