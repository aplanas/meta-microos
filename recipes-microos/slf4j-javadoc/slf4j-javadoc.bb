SUMMARY = "Javadoc for slf4j"
DESCRIPTION = "API documentation for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-javadoc-1.7.36-4.1.noarch.rpm"
RPM_HASH = "3ff2bf26a70fa68e07058f73fd2e909773c4f834acc1b74be3577e8e88989bda8fda84334493ef8b2b0d1b6343152c3e0db6e7ab7bde6cc8ac4535bafa7a9026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
