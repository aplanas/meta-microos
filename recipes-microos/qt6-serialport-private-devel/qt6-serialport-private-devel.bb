SUMMARY = "Non-ABI stable API for the Qt 6 SerialPort library"
DESCRIPTION = "This package provides private headers of libQt6SerialPort that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-serialport-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4cb6a28b7d56cfe9848f28ce265da9934c69d2d66e82bbb79165432e852bb6ff17061983a424df7e9c32b7de9a4dbab7feeec46fc1864dd6cd9b06fe490f730e"

RPROVIDES:${PN} += "qt6-serialport-private-devel qt6-serialport-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6SerialPort) qt6-core-private-devel"

inherit rpm
