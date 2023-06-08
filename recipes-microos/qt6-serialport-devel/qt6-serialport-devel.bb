SUMMARY = "Qt 6 SerialPort library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialPort library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-serialport-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "49a449cb5e74317df4a4278ae17d391c351b281802d924f6ba1d4468d770bf93b8edd0f832adc710439780c07235f7384f2f9a405854c8654cf0676b83cbf7d7"

RPROVIDES:${PN} += "cmake(Qt6SerialPort) pkgconfig(Qt6SerialPort) qt6-serialport-devel qt6-serialport-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6SerialPort6 pkgconfig(Qt6Core)"

inherit rpm
