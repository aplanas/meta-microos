SUMMARY = "Non-ABI stable API for the Qt 6 3DExtras library"
DESCRIPTION = "This package provides private headers of libQt63DExtras that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dextras-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8892e997fcd41827af21eb1bb0d074838f25b1dce35f111254d8fb697c694a8a8693c73ecd2c68781b1b170d5c3f5062bd8f573ae91e1538dab599034b278685"

RPROVIDES:${PN} += "qt6-3dextras-private-devel qt6-3dextras-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DExtras)"

inherit rpm
