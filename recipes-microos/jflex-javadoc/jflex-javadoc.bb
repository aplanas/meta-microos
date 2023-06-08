SUMMARY = "API documentation for jflex"
DESCRIPTION = "This package provides API documentation for jflex."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-javadoc-1.8.2-5.1.noarch.rpm"
RPM_HASH = "98227c6d1e1b603e715dcc6bf4788b896aa7264a05bba8ee4ce55996fd68f775422797b3093cfc18833ef2cd33dcdcc89701177102c460d1911afc53e8bbe8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-doc jflex-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
