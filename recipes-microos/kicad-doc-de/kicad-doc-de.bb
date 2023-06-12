SUMMARY = "German documentation and tutorials for KiCad"
DESCRIPTION = "This package contains German documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-de-7.0.5-1.1.noarch.rpm"
RPM_HASH = "28f5cb035b8968ab7e7d5e7ab8c7fb4434887996e8e031130f98bea43dc68f08fc0484541ac17400e0d23742ca0ee782e8a0c17b116eebfd10425ddbcb3cc05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-de locale(kicad-doc:de)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
