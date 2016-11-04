<#-- @ftlvariable name="" type="com.kainos.discoverydiary.views.AdvancedSearchView" -->
<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<div class="panel">
  <div class="panel-body">
    <h1>Enter search details</h1>
    <p class="lead">Please provide details for an advanced search.</p>

    <form enctype="multipart/form-data" action="/people/add" method="post" autocomplete="off">

        <#if errors??>
            <div class="bg-danger text-danger">
                <ul>
                <#list errors as error>
                    <li>
                        ${error}
                    </li>
                </#list>
                </ul>
            </div>
        </#if>


        <div class="form-group">
            <label for="author">Author</label>
            <input name="author" id="authorValue" type="text" placeholder="author" class="form-control" required />
        </div>

        <div class="form-group">
            <label for="publicationDate">Date of Publication</label>
            <input name="publicationDate" id="publicationValue" type="text" placeholder="publication date" class="form-control" required />
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <input name="description" id="descriptionValue" type="text" placeholder="description" class="form-control" required />
        </div>

        <div class="form-group">
            <label for="category">Category</label>
            <input name="category" id="categoryValue" type="text" placeholder="category" class="form-control" required />
        </div>

        <input type="submit" value="Confirm" class="btn btn-primary" />
        <a class="btn btn-default" href="/book/list">Cancel</a>

    </form>
  </div>
</div>

</@layoutTemplate.layout>
