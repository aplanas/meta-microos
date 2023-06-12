SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "The Qt SerialBus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6SerialBus6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "90db986dbd6b65e813f6b7978dd5bb9ba6f3c01d30d4afc095cd89a0dd5c0c25beb333af4b16723adeb2a4f1887088f98928e9cad285a3e7b1063a1c4f5dd0c8"

RPROVIDES:${PN} += "libQt6SerialBus.so.6()(64bit) \
libQt6SerialBus.so.6(Qt_6)(64bit) \
libQt6SerialBus.so.6(Qt_6.0)(64bit) \
libQt6SerialBus.so.6(Qt_6.1)(64bit) \
libQt6SerialBus.so.6(Qt_6.2)(64bit) \
libQt6SerialBus.so.6(Qt_6.3)(64bit) \
libQt6SerialBus.so.6(Qt_6.4)(64bit) \
libQt6SerialBus.so.6(Qt_6.5)(64bit) \
libQt6SerialBus.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6SerialBus6 \
libQt6SerialBus6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6SerialPort.so.6()(64bit) \
libQt6SerialPort.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
