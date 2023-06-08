SUMMARY = "Javadoc for jetty-websocket"
DESCRIPTION = "Javadoc for jetty-websocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.48"

RPM_NAME = "jetty-websocket-javadoc-9.4.48-3.1.noarch.rpm"
RPM_HASH = "3a3b00be3287daf403415404df528a5bbadbb683a7b07204ff9fdce6add6f55489510e14efe8e9ef365e8db6d016e9e4485760ec68e8f1982d8c7f35fe015ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
