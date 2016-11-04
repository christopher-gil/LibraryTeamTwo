<#import "../layout.ftl" as layoutTemplate>
    <@layoutTemplate.layout>
        <h1>Book View</h1>
        <p class="lead"> </p>
        <div>
            <label for="title">Title: </label><span name="title"> ${book.title}</span>
        </div>
        <div>
            <label for="author">Author: </label><span name="author"> ${book.author}</span>
        </div>
        <div>
            <label for="date">Date Pubished: </label><span name="date"> ${book.datePublished}</span>
        </div>
        <div>
            <label for="publisher">Publisher: </label><span name="publisher "> ${book.publisher}</span>
        </div>
        <div>
            <label for="description">Description: </label><span name="description"> ${book.description}</span>
        </div>
        <div>
            <label for="location">Location: </label><span name="location"> ${book.location}</span>
        </div>
        <div>
            <form action="/book/borrow" id="borrow_form" class="btn" name="borrow_form" method="post">
              <label for="borrower">Borrower: </lable><input type="text" name="borrower" id="borrower">
                <input type="hidden" value="${book.id}" name="id">
                <button class="form_button" type="submit">Borrow</button>
            </form>
        </div>
        <a href="/book/list/">Back</a>
    </@layoutTemplate.layout>
