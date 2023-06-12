SUMMARY = "Qt 6 Quick3DHelpers library"
DESCRIPTION = "The Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpers6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1c601a469d080b39a7de32aa3ad56cf37f221e075d27519dae46d03267fb3e6f7181b3fb595938043d84b4e6f3d1e14290752b0ae96d8bbc8b83cf644d41774e"

RPROVIDES:${PN} += "libQt6Quick3DHelpers.so.6()(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.0)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.1)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.2)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.3)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.4)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.5)(64bit) \
libQt6Quick3DHelpers.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DHelpers6 \
libQt6Quick3DHelpers6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
