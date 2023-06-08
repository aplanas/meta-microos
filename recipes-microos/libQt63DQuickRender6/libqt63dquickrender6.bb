SUMMARY = "Qt 6 3DQuickRender library"
DESCRIPTION = "The Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DQuickRender6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7c0ba15c8751d9e6d737886dc9f00c8c38f2ecadb5bc5bb571daa16fb0ad7ba2c7f9ce1fe1bb0533bebbbf982ccec6b503cb9e6223dae3b0653c45ab31558a0f"

RPROVIDES:${PN} += "libQt63DQuickRender.so.6()(64bit) libQt63DQuickRender.so.6(Qt_6)(64bit) libQt63DQuickRender.so.6(Qt_6.0)(64bit) libQt63DQuickRender.so.6(Qt_6.1)(64bit) libQt63DQuickRender.so.6(Qt_6.2)(64bit) libQt63DQuickRender.so.6(Qt_6.3)(64bit) libQt63DQuickRender.so.6(Qt_6.4)(64bit) libQt63DQuickRender.so.6(Qt_6.5)(64bit) libQt63DQuickRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DQuickRender6 libQt63DQuickRender6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DRender.so.6()(64bit) libQt63DRender.so.6(Qt_6)(64bit) libQt63DRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
