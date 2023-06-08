SUMMARY = "Non-ABI stable API for the Qt 6 Location Library"
DESCRIPTION = "This package provides private headers of libQt6Location that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-location-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "f00cd845737ec07283fdd3ac5c65d1a5a6779f7818347f0414445a93f39fd52feefad67e021c1aae17d7bb5160ec7d3269fe278b8e585f7768be698ee908ea2f"

RPROVIDES:${PN} += "qt6-location-private-devel qt6-location-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Location)"

inherit rpm
