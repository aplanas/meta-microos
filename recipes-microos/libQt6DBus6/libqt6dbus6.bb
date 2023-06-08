SUMMARY = "Qt6 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6DBus6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "be2f54b35b142076669be542eb9fadee65a22eefc1abee11019bebbab07b5d905d6380b960341252a1a9d46f2c78b122e6abc3a85089ef768db547e4914ad0e2"

RPROVIDES:${PN} += "libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6DBus.so.6(Qt_6.0)(64bit) libQt6DBus.so.6(Qt_6.1)(64bit) libQt6DBus.so.6(Qt_6.2)(64bit) libQt6DBus.so.6(Qt_6.3)(64bit) libQt6DBus.so.6(Qt_6.4)(64bit) libQt6DBus.so.6(Qt_6.5)(64bit) libQt6DBus.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6DBus6 libQt6DBus6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core6 libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
