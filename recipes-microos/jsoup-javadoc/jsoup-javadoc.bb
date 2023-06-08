SUMMARY = "Javadoc for jsoup"
DESCRIPTION = "API documentation for jsoup."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "jsoup-javadoc-1.15.3-2.2.noarch.rpm"
RPM_HASH = "e3247f748c1157f9c59e9b98b837aaee46e748e333da65cc375a0830c01f928c87ef41dbdea034f90981dc5ecc817e5715646678cbf657e64f0438be7cc47db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsoup-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
