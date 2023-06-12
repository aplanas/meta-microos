SUMMARY = "GNOME Graphics"
DESCRIPTION = "Handling of digital photos and graphics"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_imaging-20201210-16.1.aarch64.rpm"
RPM_HASH = "b53d54a56d24959ddb10cd33ae7168dca0d9b70d7df67a83a727c0a18b335bd5e993f8b2f12061aa4aec7a95876070e997ef18935261f8e95a9a3198ed8c031c"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_imaging \
patterns-gnome-gnome_imaging(aarch-64) \
patterns-openSUSE-gnome_imaging"
RDEPENDS:${PN} += "pattern()"

inherit rpm
