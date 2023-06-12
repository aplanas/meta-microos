SUMMARY = "Documentation and tutorials for KiCad"
DESCRIPTION = "Kicad is an open source software for the creation of electronic \
schematic diagrams and printed circuit board artwork. \
This is the documentation package for KiCad. It contains documentation \
and tutorials."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-7.0.5-1.1.noarch.rpm"
RPM_HASH = "bd6ea0ca754d6ba10f6f2a8707f6b08cd44371f9fcf74d392b0e7ec4b663f0ea1f50c798e71c2a909e465846130c6c724a927ecec4046f5d35d28f3b49d3e60e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc"
RDEPENDS:${PN} += ""

inherit rpm
