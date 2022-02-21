<#import "partials/main.ftlh" as main />

<@main.renderWith>
<#--<@main.renderWith scripts=["js/login.js"]>-->

    <div class="mx-auto mt-3 w-50">
        <form id="login-form" action="/login" method="post">

            <#if _csrf??>
                <input type="hidden" name="${(_csrf.parameterName)!'csrf'}" value="${(_csrf.token)!'--no-token--'}"/>
            </#if>

            <h3>Login</h3>
            <input type="email" name="username" class="form-control mb-1" placeholder="email" autofocus>
            <input type="password" name="password" class="form-control mb-1" placeholder="password">
            <button class="btn btn-outline-primary btn-block">Login</button>

            <div>
                <#if error!false >
                    <p style="color:red">Error in your input data</p>
                </#if>
            </div>
        </form>
    </div>
</@main.renderWith>
