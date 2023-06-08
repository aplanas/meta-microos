SUMMARY = "JUnit4 common module of PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the JUnit4 module of PowerMock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-junit4-1.6.5-4.10.noarch.rpm"
RPM_HASH = "470e34506c850b17ceca49facf3fefd6ba598626931665be14ba7e185ab8f1c16c006434f8e47e8429c62657e362ab3a5ccfd481b8f7171c7d7b070a00758f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.powermock:powermock-module-junit4) mvn(org.powermock:powermock-module-junit4-common) mvn(org.powermock:powermock-module-junit4-common:pom:) mvn(org.powermock:powermock-module-junit4-rule) mvn(org.powermock:powermock-module-junit4-rule:pom:) mvn(org.powermock:powermock-module-junit4:pom:) osgi(org.powermock.powermock-module-junit4) osgi(org.powermock.powermock-module-junit4-common) osgi(org.powermock.powermock-module-junit4-rule) powermock-junit4"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(junit:junit) mvn(org.powermock:powermock-classloading-base) mvn(org.powermock:powermock-core) mvn(org.powermock:powermock-reflect) powermock-common"

inherit rpm
