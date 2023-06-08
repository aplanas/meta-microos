SUMMARY = "Javadoc for plexus-bsh-factory"
DESCRIPTION = "Javadoc for plexus-bsh-factory."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-bsh-factory-javadoc-1.0~a7-2.6.noarch.rpm"
RPM_HASH = "80d324b7172660fcff93ac67937a3e2a9314dad047c3ad9ba17f55427fe4bf132c3ca5be159db5853f1db753f9cc855a868df64fea6ed8a54846cacb1806538a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-bsh-factory-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
