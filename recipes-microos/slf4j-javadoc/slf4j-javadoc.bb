SUMMARY = "Javadoc for slf4j"
DESCRIPTION = "API documentation for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-javadoc-1.7.36-3.3.noarch.rpm"
RPM_HASH = "e775a7896eff639a843938748d7530b42e8aa78498f75b43428bfc1d755f2b80df13e9f207c9953d5df5f926acb13f64ebe81c1cb5d95f0bee24f1fadd2e9669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
