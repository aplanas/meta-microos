SUMMARY = "Footprint library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the footprints library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.2"

RPM_NAME = "kicad-footprints-7.0.2-1.1.noarch.rpm"
RPM_HASH = "2a039165a89e4811b0ffb3789a329547fbc69028c650352d771bd1b1fd71679f1130cfd7bc420bbf0d6cbdd64ba0a45fb91fc43567ea6238fc647caec3f061a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-footprints kicad-library:/usr/share/kicad/template/fp-lib-table"
RDEPENDS:${PN} += ""

inherit rpm
