# HBase

 1. Java program

2. Create a social network using HBase as a Database

This database must contain these informations:

as row id: the firstnames of peoples
as CFs: info, friends
in info: put some classical info about people
in friends:
- BFF: name of the Best Friend (row ID)
- others: array of other name (each name is a row ID)

3. Create a REPL to fill up the database. BFF value is mandatory !

BONUS: create a software to check consistency between row ID and array (others column)
MALUS:
1. crashing the cluster
2. Not use camelCase except CONSTANTS_WITH_UNDERSCORES
