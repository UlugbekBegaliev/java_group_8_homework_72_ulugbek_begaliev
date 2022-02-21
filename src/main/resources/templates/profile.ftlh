<#import "partials/main.ftlh" as main />

<@main.renderWith>
    <#if dto??>
        <h1>Info about your profile</h1>
        <p>${(dto.username)!'-- missing --'} - ${(dto.email)!'-- email missing --'}</p>
    <#else>
        <h1>User is not found!</h1>
    </#if>
</@main.renderWith>