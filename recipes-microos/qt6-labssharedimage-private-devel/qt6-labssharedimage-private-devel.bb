SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "This package provides private headers of libQt6LabsSharedImage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labssharedimage-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "58fef63f449e49303c229192afa31a4922e0782511fa5bc5af301aa91a2b8ae8e4e4a14e798cec2c8d01986bc775a34bbc98886a118d057578a6dfd28522c857"

RPROVIDES:${PN} += "qt6-labssharedimage-private-devel qt6-labssharedimage-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsSharedImage)"

inherit rpm
