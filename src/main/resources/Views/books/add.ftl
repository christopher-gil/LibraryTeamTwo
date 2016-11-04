<#import "../layout.ftl" as layoutTemplate>

<@layoutTemplate.layout>

<h1>Add a Learning Resource</h1>
<p class="lead">Please provide details of the resource.</p>

<form enctype="multipart/form-data" action="/book/add" method="post" autocomplete="off">

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
        <label for="title">Title *</label>
        <input name="title" type="text" placeholder="title" class="form-control" required />

    </div>

    <div class="form-group">
        <label for="category">Category *</label>
        <input name="category" type="text" placeholder="category" class="form-control" required />
    </div>

    <div class="form-group">
            <label for="author">Author </label>
            <input name="author" type="text" placeholder="author" class="form-control" />
        </div>

    <div class="form-group">
             <label for="publisher">Publisher</label>
             <input name="publisher" type="text" placeholder="publisher" class="form-control" />
    </div>

    <div class="form-group">
              <label for="datePublished">Date Published *</label>
              <input name="datePublished" type="date" placeholder="Date Published" class="form-control" required/>
    </div>

    <div class="form-group">
              <label for="description">Description</label>
              <input name="description" type="text" placeholder="description" class="form-control" />
    </div>

    <div class="form-group">
               <label for="location">Location</label>
               <input name="location" type="text" placeholder="location" class="form-control" />
    </div>

    <input type="submit" value="Confirm" class="btn btn-primary" />
    <a class="btn btn-default" href="/book/list">Cancel</a>

</form>


</@layoutTemplate.layout>