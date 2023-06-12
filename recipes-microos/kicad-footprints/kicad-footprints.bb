SUMMARY = "Footprint library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the footprints library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.5"

RPM_NAME = "kicad-footprints-7.0.5-1.1.noarch.rpm"
RPM_HASH = "6ea9a6cbc4a233b0e55c6268748746b3319ec9857f0a590efb25c5bbcf7a4e85f0039b1dccea3050e65320d84671092ddc17ecf4ad9844f742684f9ebc4a144c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-footprints kicad-library:/usr/share/kicad/template/fp-lib-table"
RDEPENDS:${PN} += ""

inherit rpm
