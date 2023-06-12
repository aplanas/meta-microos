SUMMARY = "Non-ABI stable API for the Qt 6 SerialPort library"
DESCRIPTION = "This package provides private headers of libQt6SerialPort that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-serialport-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ea20c11f7e25dca77ff99d1bb262b127b0fa54a8a5a9d2d7b2282aa59617d8d521db3c8bd28b0ecfcf77a91ebc2d3258edb2788340ecff8af9c09f47a8b70315"

RPROVIDES:${PN} += "qt6-serialport-private-devel \
qt6-serialport-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6SerialPort) \
qt6-core-private-devel"

inherit rpm
