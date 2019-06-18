# Library Management System #

This application has three APIs to add ,search and view library items exposed as rest endpoint.

This application has been developed in SpringBoot framework.

Database-MySQl

ORM-Hibernate

Security-This application has Spring boot security rest basic authentication.

---------------------------------
The url for the APIs are as follows

1.To add the book to library db
VERB-POST
http://localhost:8082/library/addbook

Sample Request Json
{
"bookid": "105",
"bookname": "KathySierra",
"authorname": "JavaGuy",
"edition": "Pearson",
"price": "300",
"issued": "Y",
"issuedTo": "Ramesh",
"issueddate": "2019-06-13 17:55:45",
"returndate": null
}

2.API to search book in the library system by bookname
VERB-GET
http://localhost:8082/library/searchbook/DBMS

3.API to view all the books in the system
VERB-GET
http://localhost:8082/library/viewBooks

---------------------------------------------------
create and insert queries are in Books.sql
