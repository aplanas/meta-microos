SUMMARY = "GNOME Multimedia"
DESCRIPTION = "GNOME Multimedia"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_multimedia-20201210-16.1.aarch64.rpm"
RPM_HASH = "21184005ccb0442f00fbddb8e9d0fe3be5d30f2e09eb8757454b7099e78d395018a25353fa4879ea5e08b965cb70e6ae6757b6cdb2a5786d039d87218a24d6ae"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-gnome-gnome_multimedia patterns-gnome-gnome_multimedia(aarch-64) patterns-openSUSE-gnome_multimedia"
RDEPENDS:${PN} += ""

inherit rpm
