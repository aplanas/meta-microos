SUMMARY = "Qt 5 Serial Port Addon"
DESCRIPTION = "Qt Serial Port provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5SerialPort5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "723833f87ba1cfa7a262fc188212023a36ab49c4f44615c8c6ebcf00daf985a1ac75f421924ebac7c713ab73fc51d40ffd1fb5a93c09534dbd37edc7595ddec2"

RPROVIDES:${PN} += "libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5(Qt_5.0)(64bit) \
libQt5SerialPort.so.5(Qt_5.1)(64bit) \
libQt5SerialPort.so.5(Qt_5.10)(64bit) \
libQt5SerialPort.so.5(Qt_5.11)(64bit) \
libQt5SerialPort.so.5(Qt_5.12)(64bit) \
libQt5SerialPort.so.5(Qt_5.13)(64bit) \
libQt5SerialPort.so.5(Qt_5.14)(64bit) \
libQt5SerialPort.so.5(Qt_5.15)(64bit) \
libQt5SerialPort.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5SerialPort.so.5(Qt_5.2)(64bit) \
libQt5SerialPort.so.5(Qt_5.3)(64bit) \
libQt5SerialPort.so.5(Qt_5.4)(64bit) \
libQt5SerialPort.so.5(Qt_5.5)(64bit) \
libQt5SerialPort.so.5(Qt_5.6)(64bit) \
libQt5SerialPort.so.5(Qt_5.7)(64bit) \
libQt5SerialPort.so.5(Qt_5.8)(64bit) \
libQt5SerialPort.so.5(Qt_5.9)(64bit) \
libQt5SerialPort5 \
libQt5SerialPort5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
