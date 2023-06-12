SUMMARY = "PowerMock module for TestNG"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the PowerMock TestNG extension."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-testng-1.6.5-4.10.noarch.rpm"
RPM_HASH = "59851a14854069348b8361d6730873be427899c4e04ee0c2d8efc6ad09d6d52529852fb2abcdcca6b4eb9ca512bfc7d5f1fa7f864728016c97cd8cab74d158a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.powermock:powermock-module-testng) \
mvn(org.powermock:powermock-module-testng-common) \
mvn(org.powermock:powermock-module-testng-common:pom:) \
mvn(org.powermock:powermock-module-testng:pom:) \
osgi(org.powermock.powermock-module-testng) \
osgi(org.powermock.powermock-module-testng-common) \
powermock-testng"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.powermock:powermock-core) \
mvn(org.powermock:powermock-reflect) \
mvn(org.testng:testng) \
powermock-common"

inherit rpm
