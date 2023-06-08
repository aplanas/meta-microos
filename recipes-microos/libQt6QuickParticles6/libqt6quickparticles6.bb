SUMMARY = "Qt 6 QuickParticles library"
DESCRIPTION = "The Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6QuickParticles6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "6b161d2bebfc74f816921b6bb5771c38ddb5d7e12b0d89e9cab0d267a4d159f63d69a28c89c07369d93d9cdc7d34d9e0c71b36c3c8066a4252acb28d3aa95a79"

RPROVIDES:${PN} += "libQt6QuickParticles.so.6()(64bit) libQt6QuickParticles.so.6(Qt_6)(64bit) libQt6QuickParticles.so.6(Qt_6.0)(64bit) libQt6QuickParticles.so.6(Qt_6.1)(64bit) libQt6QuickParticles.so.6(Qt_6.2)(64bit) libQt6QuickParticles.so.6(Qt_6.3)(64bit) libQt6QuickParticles.so.6(Qt_6.4)(64bit) libQt6QuickParticles.so.6(Qt_6.5)(64bit) libQt6QuickParticles.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickParticles6 libQt6QuickParticles6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
