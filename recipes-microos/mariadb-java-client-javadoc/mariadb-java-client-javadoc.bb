SUMMARY = "Javadoc for mariadb-java-client"
DESCRIPTION = "This package contains the API documentation for mariadb-java-client."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.3"

RPM_NAME = "mariadb-java-client-javadoc-2.4.3-1.18.noarch.rpm"
RPM_HASH = "b7002799558bbacc1dd4a76c7f3e6ca63598afd93f6c153420fb150dfe8b8d66168b92f07e7a7f23a92e1fb017262e1294dbe5cf84ac180d9b70971dc46ab24b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-java-client-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
