SUMMARY = "Core module of PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the core module of PowerMock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-core-1.6.5-4.10.noarch.rpm"
RPM_HASH = "d651c38b4d38eb061ec8fb7a457e5872bbd7e21a350db7dce6c04f6f538b17bfad8e666e4a82f5a8879720bcf06f143ff46c4e1d03b314561704df23b1488445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.powermock:powermock-classloading-base) mvn(org.powermock:powermock-classloading-base:pom:) mvn(org.powermock:powermock-classloading-objenesis) mvn(org.powermock:powermock-classloading-objenesis:pom:) mvn(org.powermock:powermock-core) mvn(org.powermock:powermock-core:pom:) osgi(org.powermock.powermock-classloading-base) osgi(org.powermock.powermock-classloading-objenesis) osgi(org.powermock.powermock-core) powermock-core"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.javassist:javassist) mvn(org.powermock:powermock-api-support) mvn(org.powermock:powermock-reflect) powermock-common"

inherit rpm
