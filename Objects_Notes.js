/*
{} : used to define a new object

properties is what the item is called in an array.
order does not matter to retrieve them
preferably used for un-structure data

example of an object:
const kira = {
firstName: Kira,
lastName: Karilen,
age: 22,
job: software developer
}

To retrieve a property can be with dot notation and bracket notation.
dot notation: kira.lastName ---> it will log Karilen
    the real property name needs to be in order for it to work

bracket notation kira('lastName') ---> it will log Karilen
    you can create your own string with the bracket notation
    good to use because the expression will be evaluated.


Adding new properties to the object:

dot notation:
    objectName.property = 'value';
        ex: kira.locaton = 'new york';
bracket notation:
    objectName['property'] = 'value';
        ex; kira['location'] = 'new york' ;

 */

//challenge
// `${jonas.firstname} has ${jonas.friends.length} and his bestfriend is called ${jonas.friends[0].}`;

/*
Object methods:

Adding functions to objects:

const kira = {
firstName: Kira,
lastName: Karilen,
age: 22,
job: software developer

calcJob : function (job){
return `You are a ${job};
}

};

calling the function:
    dot notation: kira.calcJob(softwaredeveloer);
    bracket notation: (kira['calcJob'](softwaredeveloer));

A function attached to an object is called a method

 */