<#-- @ftlvariable name="" type="com.kainos.discoverydiary.views.BooksListView" -->
    <#import "../layout.ftl" as layoutTemplate>
        <@layoutTemplate.layout>
            <table class="table" id="table">
                <thead>
                    <th></th>
                    <th>Title</th>
                </thead>
                <tbody>
                    <#list books as book>
                        <tr>
                        <td>
                        <img src="${book.imageLocation}" width="100" height="100">
                            <td>
                                <a href="/book/${book.id}">${book.title}</a>
                            </td>
                        </tr>
                    </#list>

                </tbody>
            </table>
            <script src="/assets/js/Booklist.js"></script>
</@layoutTemplate.layout>
