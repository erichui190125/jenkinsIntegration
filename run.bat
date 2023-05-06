set projectLocation=C:\Users\erich\OneDrive\Desktop\qa-060b0764-2463-4651-98fb-456a6bb95b75-qa
cd %projectLocation%

if not defined in_subprocess (cmd /k set in_subprocess=y ^& %0 %*) & exit )
mvn clean test -Dfilename=TestNG1.xml

pause