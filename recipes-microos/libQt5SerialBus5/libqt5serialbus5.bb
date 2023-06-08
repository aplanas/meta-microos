SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others. \
 \
This package contains base tools, like string, xml, and network \
handling."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5SerialBus5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "0474b27754cf5fda12e3ecf419cacd8855b7251b9d467f4fbf74a84200f92344d3ad08dc6a2f664593dc1d25260ef17edab87584469ffcb4eafe30bc73e39e2d"

RPROVIDES:${PN} += "libQt5SerialBus.so.5()(64bit) libQt5SerialBus.so.5(Qt_5)(64bit) libQt5SerialBus.so.5(Qt_5.0)(64bit) libQt5SerialBus.so.5(Qt_5.1)(64bit) libQt5SerialBus.so.5(Qt_5.10)(64bit) libQt5SerialBus.so.5(Qt_5.11)(64bit) libQt5SerialBus.so.5(Qt_5.12)(64bit) libQt5SerialBus.so.5(Qt_5.13)(64bit) libQt5SerialBus.so.5(Qt_5.14)(64bit) libQt5SerialBus.so.5(Qt_5.15)(64bit) libQt5SerialBus.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5SerialBus.so.5(Qt_5.2)(64bit) libQt5SerialBus.so.5(Qt_5.3)(64bit) libQt5SerialBus.so.5(Qt_5.4)(64bit) libQt5SerialBus.so.5(Qt_5.5)(64bit) libQt5SerialBus.so.5(Qt_5.6)(64bit) libQt5SerialBus.so.5(Qt_5.7)(64bit) libQt5SerialBus.so.5(Qt_5.8)(64bit) libQt5SerialBus.so.5(Qt_5.9)(64bit) libQt5SerialBus5 libQt5SerialBus5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5SerialPort.so.5()(64bit) libQt5SerialPort.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
