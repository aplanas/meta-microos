SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "a13edd61f20cc89310cc3897906c05b17978641f16a408f398b4f2e80dcf4f8e5863c63c7f196931dfe28b3f4d7c6f99393518d2539163a7890da354f80b7ec3"

RPROVIDES:${PN} += "libQt6QmlLocalStorage.so.6()(64bit) libQt6QmlLocalStorage.so.6(Qt_6)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.0)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.1)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.2)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.3)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.4)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.5)(64bit) libQt6QmlLocalStorage.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QmlLocalStorage6 libQt6QmlLocalStorage6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
