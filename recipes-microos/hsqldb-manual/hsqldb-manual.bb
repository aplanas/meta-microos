SUMMARY = "Manual for hsqldb"
DESCRIPTION = "Manual for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "hsqldb-manual-2.7.1-1.2.noarch.rpm"
RPM_HASH = "ba200138c6fdeb0e232a4aa9d355afa09bf74b70834484986027e19b2d30026ad330d5733b598933edb13d52ebf5ff2ed86a03828278b4be48c386100f47b6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-manual"
RDEPENDS:${PN} += ""

inherit rpm
