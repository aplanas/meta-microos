SUMMARY = "Qt5 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5DBus5-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "d2372ac7bbd51d25fa896e30e8d7ba2b4637fce09e3df481cfae4533bd296176a066fcef02908b0870ae0469bb494cbb30302855c966d72937cee3fc1dcda399"

RPROVIDES:${PN} += "libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5DBus.so.5(Qt_5.0)(64bit) libQt5DBus.so.5(Qt_5.1)(64bit) libQt5DBus.so.5(Qt_5.10)(64bit) libQt5DBus.so.5(Qt_5.11)(64bit) libQt5DBus.so.5(Qt_5.12)(64bit) libQt5DBus.so.5(Qt_5.13)(64bit) libQt5DBus.so.5(Qt_5.14)(64bit) libQt5DBus.so.5(Qt_5.15)(64bit) libQt5DBus.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5(Qt_5.2)(64bit) libQt5DBus.so.5(Qt_5.3)(64bit) libQt5DBus.so.5(Qt_5.4)(64bit) libQt5DBus.so.5(Qt_5.5)(64bit) libQt5DBus.so.5(Qt_5.6)(64bit) libQt5DBus.so.5(Qt_5.7)(64bit) libQt5DBus.so.5(Qt_5.8)(64bit) libQt5DBus.so.5(Qt_5.9)(64bit) libQt5DBus5 libQt5DBus5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
