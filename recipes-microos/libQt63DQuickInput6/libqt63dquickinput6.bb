SUMMARY = "Qt 6 3DQuickInput library"
DESCRIPTION = "The Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickInput6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dfbac90e905e3d14d359de25ee2d257741c6de721114e7010c0eb52c87e3fe17fb2319340c6373b18a1180889967077392fe24bf8e0e3440169b83641b5647e9"

RPROVIDES:${PN} += "libQt63DQuickInput.so.6()(64bit) \
libQt63DQuickInput.so.6(Qt_6)(64bit) \
libQt63DQuickInput.so.6(Qt_6.0)(64bit) \
libQt63DQuickInput.so.6(Qt_6.1)(64bit) \
libQt63DQuickInput.so.6(Qt_6.2)(64bit) \
libQt63DQuickInput.so.6(Qt_6.3)(64bit) \
libQt63DQuickInput.so.6(Qt_6.4)(64bit) \
libQt63DQuickInput.so.6(Qt_6.5)(64bit) \
libQt63DQuickInput.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DQuickInput6 \
libQt63DQuickInput6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt63DCore.so.6()(64bit) \
libQt63DCore.so.6(Qt_6)(64bit) \
libQt63DCore.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt63DInput.so.6()(64bit) \
libQt63DInput.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
