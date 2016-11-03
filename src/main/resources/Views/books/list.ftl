<#-- @ftlvariable name="" type="com.kainos.discoverydiary.views.PeopleListView" -->
<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<table class="table">
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

</@layoutTemplate.layout>