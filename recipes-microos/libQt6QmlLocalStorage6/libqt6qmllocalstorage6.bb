SUMMARY = "Qt 6 QmlLocalStorage library"
DESCRIPTION = "The Qt 6 QmlLocalStorage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlLocalStorage6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "22465919371fd3fa04bd9ffef45d1ca7bf0949f0ab4b520ec85c6eae2576ebc54142c4db5c9dacc9d336d37845d9fc9218b4cb13fc2b263e91fa55ad85bdb25b"

RPROVIDES:${PN} += "libQt6QmlLocalStorage.so.6()(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.0)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.1)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.2)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.3)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.4)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.5)(64bit) \
libQt6QmlLocalStorage.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6QmlLocalStorage6 \
libQt6QmlLocalStorage6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
