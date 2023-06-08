SUMMARY = "Javadoc for jetty-unixsocket"
DESCRIPTION = "Javadoc for jetty-unixsocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-unixsocket-javadoc-9.4.48-3.1.noarch.rpm"
RPM_HASH = "0802817ca345097eb0774848f6b905bd3c5dd168e5403b9d24825ea761849dc9ffb10b9beb5261ad5aec2c6448f97e21f48fef88c06f6c546a459fdd06e56c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
