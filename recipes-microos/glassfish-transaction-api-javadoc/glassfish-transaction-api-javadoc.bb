SUMMARY = "Javadoc for glassfish-transaction-api"
DESCRIPTION = "This package contains javadoc for glassfish-transaction-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-javadoc-1.3-3.10.noarch.rpm"
RPM_HASH = "4f13e629cd3f02c8f744f3cf712b631e5db23e4d94cbe5a25a25d6ff5c17dfe1e855bd6634f55e8807073d2729ba8ac738d80b132bbd92c1bbeaf4896800d745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
