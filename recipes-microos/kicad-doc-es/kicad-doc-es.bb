SUMMARY = "Spanish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Spanish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-es-7.0.2-1.1.noarch.rpm"
RPM_HASH = "829496ccd7175308aad809d146740807044d2f683bb98ad0beae11f7327e31047343162c120ac74e1dc73f825713fe96f7a30db8ff4fb3c118c3a3eb616f8fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-es locale(kicad-doc:es)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
