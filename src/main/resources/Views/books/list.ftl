<#-- @ftlvariable name="" type="com.kainos.discoverydiary.views.PeopleListView" -->
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

<a class="btn btn-default" href="/people/add">New</a>

<script src="/assets/js/Booklist.js"></script>

</@layoutTemplate.layout>