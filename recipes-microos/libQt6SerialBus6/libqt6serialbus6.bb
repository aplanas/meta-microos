SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "The Qt SerialBus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6SerialBus6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "504c4d318fb98b6f363cf0436bcd09289cc8f875d686d805e2b311af02c747654a7d2c866b7b82cc38427eb4c6a920b418ed6372e667361f8c0a858ee4ce487b"

RPROVIDES:${PN} += "libQt6SerialBus.so.6()(64bit) libQt6SerialBus.so.6(Qt_6)(64bit) libQt6SerialBus.so.6(Qt_6.0)(64bit) libQt6SerialBus.so.6(Qt_6.1)(64bit) libQt6SerialBus.so.6(Qt_6.2)(64bit) libQt6SerialBus.so.6(Qt_6.3)(64bit) libQt6SerialBus.so.6(Qt_6.4)(64bit) libQt6SerialBus.so.6(Qt_6.5)(64bit) libQt6SerialBus.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6SerialBus6 libQt6SerialBus6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6SerialPort.so.6()(64bit) libQt6SerialPort.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
