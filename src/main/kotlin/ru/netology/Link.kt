package ru.netology

data class Link(

    val url: String, //URL ссылки.
    val title: String, //Заголовок ссылки.
    val caption: String, //Подпись ссылки (если имеется).
    val description: String, //Описание ссылки.
    val photo: Photo, //Изображение превью, объект фотографии (если имеется).
    val product: String, //Информация о продукте (если имеется). Поле возвращается для ссылок на магазины, например, AliExpress. Объект с единственным полем price (object), которое описано на отдельной странице.
    val button: String, //Информация о кнопке для перехода (если имеется). Объект описан на отдельной странице.
    val preview_page: String, //Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val preview_url: String //URL страницы с контентом для предпросмотра содержимого страницы.

)