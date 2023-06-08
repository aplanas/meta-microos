SUMMARY = "JavaDocs for powermock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains the API documentation for powermock."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-javadoc-1.6.5-4.10.noarch.rpm"
RPM_HASH = "e90010946b129210da59ac2465ab5038f55f6a340d85c73275619db147f8d8d82e3e6e99a4876f97973c665e2984953115210cf7577705267cc001ab6e45c605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powermock-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
