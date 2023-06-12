SUMMARY = "Qt 6 3DLogic library"
DESCRIPTION = "The Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DLogic6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "928899cc3a4fbafc94455f5be6ed37a9bff07788b55d92b80ad8951dfbc6227223116355b576843542159ec67f94f7d87ab7f6057643459d6a511502ef30350e"

RPROVIDES:${PN} += "libQt63DLogic.so.6()(64bit) libQt63DLogic.so.6(Qt_6)(64bit) libQt63DLogic.so.6(Qt_6.0)(64bit) libQt63DLogic.so.6(Qt_6.1)(64bit) libQt63DLogic.so.6(Qt_6.2)(64bit) libQt63DLogic.so.6(Qt_6.3)(64bit) libQt63DLogic.so.6(Qt_6.4)(64bit) libQt63DLogic.so.6(Qt_6.5)(64bit) libQt63DLogic.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt63DLogic6 libQt63DLogic6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
