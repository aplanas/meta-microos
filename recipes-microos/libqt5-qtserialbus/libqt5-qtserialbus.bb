SUMMARY = "Qt 5 Serial Bus Addon"
DESCRIPTION = "The Qt Serial Bus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialbus-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "ff34878098412e82747e24e1e665ba3882f53030aef42e632673d7bb72c368b00da51cb6d422a3a8842049a855fcb035f9f5a27f630770f87d1070391617eb2c"

RPROVIDES:${PN} += "libqt5-qtserialbus libqt5-qtserialbus(aarch-64) libqtpassthrucanbus.so()(64bit) libqtpeakcanbus.so()(64bit) libqtsocketcanbus.so()(64bit) libqttinycanbus.so()(64bit) libqtvirtualcanbus.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5SerialBus.so.5()(64bit) libQt5SerialBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
