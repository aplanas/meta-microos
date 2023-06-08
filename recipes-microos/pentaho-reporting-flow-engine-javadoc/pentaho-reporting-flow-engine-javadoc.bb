SUMMARY = "Javadoc for pentaho-reporting-flow-engine"
DESCRIPTION = "Javadoc for pentaho-reporting-flow-engine."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "pentaho-reporting-flow-engine-javadoc-0.9.4-6.6.noarch.rpm"
RPM_HASH = "0be63970604e5d199166863d1a800d740a62191d3e7934a89dd44bab1faf3369163a134fa8c1cb848565770d51fbefe1b008259fd1d94123f2b2c71b86f59d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-reporting-flow-engine-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
