# Втора лабораториска вежба по Софтверско инженерство

## Дени Јованов, бр. на индекс 141527

### Група на код: 

Ја добив групата на код 3

###  Control Flow Graph

![CFG picture](https://i.imgur.com/l09eS22.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 8, истата ја добив преку формулата E - N + 2*P, каде што P е бројот на предикатни јазли. Во случајoв P=1, N бројот на јазли. Во овој случај 19, E
е бројот на рабови. Во овој случај 25, па цикломатската комплексност изнесува 8.

### Тест случаи според критериумот  Every branch 

	throwExceptionNullUser - branches to the exception if the user is null
	throwExceptionNullUsernameOrPassword - branches to the exception if either the username or 		password are null
	passwordContainsUsername - branches to return false if the username is in the password
	passwordLengthShort - branches to return false if the password is too short
	passwordContainsDigit - branches to change the digit boolean to true if there is a digit
	passwordContainsNoDigitAndContainsUpperCase - branches if there is no digit but there is an uppercase letter
	passwordContainsNoUpperCaseAndContainsSpecial - branches if there is no digit or uppercase but there is a special character
	passwordContainsNoSpecial - branches if there is no special character
	passwordDidNotContainDigitUpperAndSpecial - branches to return false if there is no digit or uppercase or special character 
	passwordIsValid - branches to true if the password is valid


### Тест случаи според критериумот Every path

	returnExceptionUserNull - the path that returns exception for null user
	returnExceptionUsernameOrPasswordNull - the path that returns exception for null username or password
	returnFalsePasswordContainsUsername - the path that returns false for path that has username in password
	returnFalsePasswordTooShort - the path that returns false when the password is too short
	returnFalseInvalidPasswordNoDigit - the path that returns false because the password has no digit
	returnFalseInvalidPasswordNoUpperCase - the path that returns false becaue the password has no upper case letter
	returnFalseInvalidPasswordNoSpecial - the path that returns false because the password has no special character
	returnTrueForValidUser - the path that returns true for a valid password

### Објаснување на напишаните unit tests

Unit тестовите се напишани според секој од тест случаевите наведени горе секоја функција тестира секој тест случај од критериумите. Во случај на every path критериумот секој тест беше напишан така да асертираме дека ќе го добиеме правилниот излез според влезот истото и за every branch критериумот. 
Прво се тестира дали ќе се добие exception ако било user или username/password се null во двете функции. 
Потоа се тестира за корисничко име во пасворд, прекраток пасворд. Во path тестовите само се проверува ако фали било број, голема буква или посебен карактер додека во branch тестовите се проверуваат сите branches и комбинации. На крај се тестира валиден корисник. Според тоа ако тестовите се поминат целосно програмата ни работи како што треба според CFG.



