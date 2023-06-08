SUMMARY = "Schematic symbol library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the schematic symbol library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.2"

RPM_NAME = "kicad-symbols-7.0.2-1.1.noarch.rpm"
RPM_HASH = "5fef02e45976a31c6597811523f726042c99268aaf5597c0dbe576b94d76da201acd233f2f56e1ef66b3b262bb7624d04dcbbbe577006678082f091bf6569932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library kicad-symbols"
RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
