@param models.Books page

<html lang="en">
	<style>
		form {
    		display: inline-block; //Or display: inline; 
		}
	</style>
	<body>
		<a href="/library/add">Add Book</a>
		<br/>
	    <p>The books are:</p>
	    <ul>
		    @for(int i = 0; i < page.getBooks().size(); ++i)
		        <li>
		        	<span>${page.getBooks().get(i).getBookName()} - ${page.getBooks().get(i).getYearPublished()}</span>
		        	<br />
		        	<span>By $unsafe{page.getBooks().get(i).getAuthor()}
			        	<form action="/library/delete" method="get">
	  						<input type="hidden" name="book_id" value="${page.getBooks().get(i).getId()}"><br>
							<button type="submit">Delete</button>
						</form>  
					</span>
		        </li>
		    @endfor
		</ul>
	</body>
</html>