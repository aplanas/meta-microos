SUMMARY = "Test Java code using mock objects"
DESCRIPTION = "jMock is a library for testing Java code using mock objects. Mock \
   objects help you design and test the interactions between the \
   objects in your programs. The jMock package: * makes it quick and \
   easy to define mock objects, so you don't break the rhythm of \
   programming. \
 \
* lets you define flexible constraints over object interactions, \
   reducing the brittleness of your tests. \
 \
* is easy to extend."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jmock-1.2.0-30.6.noarch.rpm"
RPM_HASH = "8377a57e21acf44cf9a577f6c1a5f2632bb38265eb83731549e293754ae8d09d94b4c914b987503dbba3464db9c644b4bcc8c9b0783eb71e34a25b46519dc71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock mvn(jmock:jmock) mvn(jmock:jmock:pom:)"
RDEPENDS:${PN} += "cglib java-headless javapackages-filesystem mvn(junit:junit) objectweb-asm"

inherit rpm
