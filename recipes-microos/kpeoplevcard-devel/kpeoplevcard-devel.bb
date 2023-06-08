SUMMARY = "Development files for kpeoplevcard, a vCard plugin for KPeople"
DESCRIPTION = "Development files for kpeoplevcard, a datasource plugin for KPeople that reads \
vCard files from the local filesystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1"

RPM_NAME = "kpeoplevcard-devel-0.1-1.15.aarch64.rpm"
RPM_HASH = "450e363aa6c34fdbea4c558e9a472d5763d11dae6965cbea1643680ba5ea6cb66f4476add267991d825e40129140befefc75e4c74b4ea16137f33decee6fecae"

RPROVIDES:${PN} += "cmake(KF5PeopleVCard) kpeoplevcard-devel kpeoplevcard-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
