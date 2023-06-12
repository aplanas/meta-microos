SUMMARY = "PowerMock EasyMock API module"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the PowerMock EasyMock API extension."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-api-easymock-1.6.5-4.10.noarch.rpm"
RPM_HASH = "0532aeb324df3f02fb79d28f9873bdc4d215f7a8b5b236b0e5dbe2c488fe6538b966fdcc33e49d03153220e26d7a059251077ebeac119266b6c24930d745efab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.powermock:powermock-api-easymock) \
mvn(org.powermock:powermock-api-easymock:pom:) \
osgi(org.powermock.powermock-api-easymock) \
powermock-api-easymock"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(cglib:cglib-nodep) \
mvn(org.powermock:powermock-api-support) \
powermock-common"

inherit rpm
