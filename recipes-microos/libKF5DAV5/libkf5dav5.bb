SUMMARY = "Core library for kdav"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5DAV5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "90e5f6631645de0a352963f8097558b5cc573c2b3ccd44da1e95bcb269cf5179a7b0f419abf7b1551790a2ad3c3a43325c31ff336d704f3a88fa9f6ce9057b8c"

RPROVIDES:${PN} += "libKF5DAV.so.5()(64bit) libKF5DAV5 libKF5DAV5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kdav ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
