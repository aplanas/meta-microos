SUMMARY = "Qt 6 3DInput library"
DESCRIPTION = "The Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt63DInput6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ec7e4f5d2a6b57127fe1c7bca6f35938e698cef835a9d11b66a3f5acdb1f785bd7bc4e4fd56a8b79d168d0f02f8c54f2c9904fdb93407d6b7bd8ad6de991dbf3"

RPROVIDES:${PN} += "libQt63DInput.so.6()(64bit) libQt63DInput.so.6(Qt_6)(64bit) libQt63DInput.so.6(Qt_6.0)(64bit) libQt63DInput.so.6(Qt_6.1)(64bit) libQt63DInput.so.6(Qt_6.2)(64bit) libQt63DInput.so.6(Qt_6.3)(64bit) libQt63DInput.so.6(Qt_6.4)(64bit) libQt63DInput.so.6(Qt_6.5)(64bit) libQt63DInput.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt63DInput6 libQt63DInput6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt63DCore.so.6()(64bit) libQt63DCore.so.6(Qt_6)(64bit) libQt63DCore.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
