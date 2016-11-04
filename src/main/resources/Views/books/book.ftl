<#import "../layout.ftl" as layoutTemplate>
    <@layoutTemplate.layout>
        <h1>Book View</h1>
        <p class="lead"> </p>
        <div>
        <img src="${book.imageLocation}" width="100" height="100">
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
        <#if book.isBorrowed == true>
            <div>
                <div>
                    <label for="bookIsBorrowedBy">Borrower: </label><span name="bookIsBorrowedBy"> ${book.borrowedBy}</span>
                </div>
                <div>
                    <label for="borrowDate">Date Borrowed:</label><span name="borrowDate"> ${book.borrowedOn}</span>
                </div>
                <form action="/book/return" method="post" name="return_form">
                    <input type="hidden" value="${book.id}" name="idReturn">
                    <button type="submit" class="btn"> Return </button>
                </form>
            </div>
            <#else>
                <div>
                    <form action="/book/borrow" id="borrow_form" name="borrow_form" method="post">
                        <label for="borrower">Borrower: </lable><input type="text" name="borrower" id="borrower">
                <input type="hidden" value="${book.id}" name="idBorrow">
                <button class="form_button" type="submit" class="btn">Borrow</button>
            </form>
        </div>
        </#if>
        <a href="/book/list/">Back</a>
    </@layoutTemplate.layout>
