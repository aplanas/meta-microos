SUMMARY = "3D model libraries for rendering and MCAD integration"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This package contains 3D models associated with the various KiCad footprint \
library components for rendering and mechanical CAD (MCAD) integration."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.2"

RPM_NAME = "kicad-packages3D-7.0.2-1.1.noarch.rpm"
RPM_HASH = "378685a6d3e4560a6a52017a75ecd57def76458e6b1bfe40fed7e4687e5c4b689a64d87af75bf45f68b46d9005896c0d7e9001083812e93ca5fccb25a17333ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library-3d kicad-packages3D"
RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
