SUMMARY = "Javadoc for minlog"
DESCRIPTION = "This package contains javadoc for minlog."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "minlog-javadoc-1.3.1-1.3.noarch.rpm"
RPM_HASH = "57884e0008a224a19fe0bb9a2ce859adaa8cdc2eec82602728e3579ba4a7c82d48f4d22bb0c32282638c95318eadd1f15b5e85b8010e8afac069caac86329dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
