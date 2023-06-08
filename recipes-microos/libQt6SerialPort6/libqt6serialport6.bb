SUMMARY = "Qt 6 SerialPort library"
DESCRIPTION = "The Qt SerialPort library provides the basic functionality, which includes \
configuring, I/O operations, getting and setting the control signals \
of the RS-232 pinouts. This module does not support terminal features \
(echo, CR/LF control, text mode, timeouts/delays, or poinout signal \
change notification)."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6SerialPort6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a4138b83b429f532035cf72181fb31cf2cc32ce99811543cbc00bd6ebc9eba727c9d3f372b15cbddaedbdc1c723398bdb6fb156a16bf033e5fd4b0738adb27ea"

RPROVIDES:${PN} += "libQt6SerialPort.so.6()(64bit) libQt6SerialPort.so.6(Qt_6)(64bit) libQt6SerialPort.so.6(Qt_6.0)(64bit) libQt6SerialPort.so.6(Qt_6.1)(64bit) libQt6SerialPort.so.6(Qt_6.2)(64bit) libQt6SerialPort.so.6(Qt_6.3)(64bit) libQt6SerialPort.so.6(Qt_6.4)(64bit) libQt6SerialPort.so.6(Qt_6.5)(64bit) libQt6SerialPort.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6SerialPort6 libQt6SerialPort6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
