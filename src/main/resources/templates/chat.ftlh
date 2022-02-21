<#import "partials/main.ftlh" as main />

<@main.renderWith scripts=["js/chat.js"]>

    <div class="chat">

    </div>

    <form action="">
        input
    </form>
    <form class="messageForm" action="/message" method="post">
        <textarea name="text"></textarea>
        <button type="submit" class="send">Send</button>
    </form>
</@main.renderWith>