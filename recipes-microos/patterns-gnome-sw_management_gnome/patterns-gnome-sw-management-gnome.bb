SUMMARY = "Package Management - Graphical Tools for GNOME"
DESCRIPTION = "Package Management - Graphical Tools"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-sw_management_gnome-20201210-16.1.aarch64.rpm"
RPM_HASH = "7dbf9a360dd8cacc4f0671b5d21c570bc6a848167e3a41885659c114d9ccdec439fbbc1479904bb3b4fe55146bfd794801ac46ae8c099ea8ec694fd9633758c1"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-gnome-sw_management_gnome patterns-gnome-sw_management_gnome(aarch-64) patterns-openSUSE-sw_management_gnome"
RDEPENDS:${PN} += "pattern()"

inherit rpm
