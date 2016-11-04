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
        <a href="/book/list/">Back</a>
    </@layoutTemplate.layout>
