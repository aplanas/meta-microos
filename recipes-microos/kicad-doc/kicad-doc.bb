SUMMARY = "Documentation and tutorials for KiCad"
DESCRIPTION = "Kicad is an open source software for the creation of electronic \
schematic diagrams and printed circuit board artwork. \
This is the documentation package for KiCad. It contains documentation \
and tutorials."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-7.0.2-1.1.noarch.rpm"
RPM_HASH = "ce775c45fbe300597c4d1ec3f4b7dfe0c5d25110e0db0265a9efc681f4f2cbf0d0387f0ba4e0455ddef30189fd039caf85d6facb370946280fc8f5b1d6fe9451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc"
RDEPENDS:${PN} += ""

inherit rpm
