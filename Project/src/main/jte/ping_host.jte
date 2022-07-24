@param models.CommandResult page

<html lang="en">
	<head>
    	<meta charset="utf-8">
    	<title></title>
  	</head>
	<body>
    	<form action="/ping" method="get">
    		<label for="host">Host</label>
			<input type="text" name="host"/>
			<br>
			<button type="submit">Ping Host</button>
			<br />
			@if(page != null)
		        <h2>Results for $unsafe{page.getHost()}</h2>
				<pre>${page.getResult()}</pre>
			
		    @endif
		</form>
	</body>
</html>