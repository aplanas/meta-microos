SUMMARY = "Qt 5 Bluez Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Bluetooth5-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "9a2dc709ea0a7eebfde8c177d238f6e0ac965a57070eaeac79fb60156bdced7e4110f1dc56d5886cb427d3028a72ec76da37c6a47eaf672e8fb15d20e1e98b5a"

RPROVIDES:${PN} += "libQt5Bluetooth.so.5()(64bit) \
libQt5Bluetooth.so.5(Qt_5)(64bit) \
libQt5Bluetooth.so.5(Qt_5.0)(64bit) \
libQt5Bluetooth.so.5(Qt_5.1)(64bit) \
libQt5Bluetooth.so.5(Qt_5.10)(64bit) \
libQt5Bluetooth.so.5(Qt_5.11)(64bit) \
libQt5Bluetooth.so.5(Qt_5.12)(64bit) \
libQt5Bluetooth.so.5(Qt_5.13)(64bit) \
libQt5Bluetooth.so.5(Qt_5.14)(64bit) \
libQt5Bluetooth.so.5(Qt_5.15)(64bit) \
libQt5Bluetooth.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Bluetooth.so.5(Qt_5.2)(64bit) \
libQt5Bluetooth.so.5(Qt_5.3)(64bit) \
libQt5Bluetooth.so.5(Qt_5.4)(64bit) \
libQt5Bluetooth.so.5(Qt_5.5)(64bit) \
libQt5Bluetooth.so.5(Qt_5.6)(64bit) \
libQt5Bluetooth.so.5(Qt_5.7)(64bit) \
libQt5Bluetooth.so.5(Qt_5.8)(64bit) \
libQt5Bluetooth.so.5(Qt_5.9)(64bit) \
libQt5Bluetooth5 \
libQt5Bluetooth5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
