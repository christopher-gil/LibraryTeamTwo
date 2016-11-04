<#-- @ftlvariable name="" type="com.kainos.discoverydiary.views.BooksListView" -->
<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<table class="table" id="table">

    <thead>
        <th>Title</th>
    </thead>

    <tbody>
        <#list books as book>
            <tr>
            <td>
                ${book.title}
            </td>

            </tr>
        </#list>

    </tbody>
</table>

<script src="/assets/js/Booklist.js"></script>

</@layoutTemplate.layout>
