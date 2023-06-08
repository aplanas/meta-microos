SUMMARY = "Non-ABI stable API for the Qt 6 WebSockets library"
DESCRIPTION = "This package provides private headers of libQt6WebSockets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-websockets-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "52a99821809fa5ecfea2ad70fcaca334f55243b2c8a951108f01a91c839fe022a1875d32c180152bd1e4b5f24429d33f934f17b83e268cf7a9e9a16cac10d81a"

RPROVIDES:${PN} += "qt6-websockets-private-devel qt6-websockets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebSockets) qt6-core-private-devel"

inherit rpm
