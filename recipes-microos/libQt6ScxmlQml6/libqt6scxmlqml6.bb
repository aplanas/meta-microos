SUMMARY = "Qt 6 ScxmlQml library"
DESCRIPTION = "The Qt6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6ScxmlQml6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "f1c5b143ea3d548bdc6b175049ba2e9c6918d1e96c0c661accf5262a5b4cebc1c8f81353b35080335252d592c0a387cdd6f79f7351388913fea7c14d1dd50fad"

RPROVIDES:${PN} += "libQt6ScxmlQml.so.6()(64bit) libQt6ScxmlQml.so.6(Qt_6)(64bit) libQt6ScxmlQml.so.6(Qt_6.0)(64bit) libQt6ScxmlQml.so.6(Qt_6.1)(64bit) libQt6ScxmlQml.so.6(Qt_6.2)(64bit) libQt6ScxmlQml.so.6(Qt_6.3)(64bit) libQt6ScxmlQml.so.6(Qt_6.4)(64bit) libQt6ScxmlQml.so.6(Qt_6.5)(64bit) libQt6ScxmlQml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ScxmlQml6 libQt6ScxmlQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Scxml.so.6()(64bit) libQt6Scxml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
