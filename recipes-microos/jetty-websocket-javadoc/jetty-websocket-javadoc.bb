SUMMARY = "Javadoc for jetty-websocket"
DESCRIPTION = "Javadoc for jetty-websocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-javadoc-9.4.51-1.1.noarch.rpm"
RPM_HASH = "e2b183302654cd4af4eb586c0d27cc62fc4763977012d151f42e17629857c0865022e322db80a4237f421866717a1f79b5237a6b7bd31541f322cff024aac7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
