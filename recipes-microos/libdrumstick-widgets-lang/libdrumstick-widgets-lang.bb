SUMMARY = "Translations for package libdrumstick-widgets"
DESCRIPTION = "Provides translations for the 'libdrumstick-widgets' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-widgets-lang-2.7.2-1.3.noarch.rpm"
RPM_HASH = "fa02d0b78f0b4e00d53ab87bb7d7532f09fd269f74960225a7fb044ca5da0c8617b6f6fa8cee96a3933faf1a52ae5aafd2d2a09bf06e5b8ddbcc9af837e2ec19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdrumstick-widgets-lang \
libdrumstick-widgets-lang-all"
RDEPENDS:${PN} += "libdrumstick-widgets"

inherit rpm
