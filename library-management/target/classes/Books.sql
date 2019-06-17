
--
--Database librarydb--
--
create database librarydb
-----------------------------------------------
--
--Create Query for table books--
--
CREATE TABLE IF NOT EXISTS `books` (
  `bookid` int(10) NOT NULL ,
  `bookname` varchar(100) NOT NULL,
  `authurname` varchar(100) NOT NULL,
  `edition` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL,
  `issued` varchar(5) NOT NULL,
  `issuedTo` varchar(50) ,
  `issueddate` varchar(50) ,
  `returndate` varchar(50) ,
  PRIMARY KEY (`bookid`)
) 
---------------------------------------------------
--
--Insert Query to dump data in database--
--
INSERT INTO `books` (`bookid`, `bookname`, `authorname`, `edition`, `price`, `issued`, `issuedTo`, `issueddate`, `returndate`) VALUES
(106, 'Ccghh', 'Shrivastav', 'BPB', 350, 'Y', 'Paul', '2019-06-10 17:55:45' , ' 2019-06-17 17:55:45')

