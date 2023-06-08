SUMMARY = "Qt 6 Positioning library"
DESCRIPTION = "The Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Positioning6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b4b607f39f0b542eace06aae5cc7e05e1422f032d8460ba2863c69e3c4ae6fcec165c2432a24118743667814f54bbe35ccfc62aebc16f1517aba813e23e14ecf"

RPROVIDES:${PN} += "libQt6Positioning.so.6()(64bit) libQt6Positioning.so.6(Qt_6)(64bit) libQt6Positioning.so.6(Qt_6.0)(64bit) libQt6Positioning.so.6(Qt_6.1)(64bit) libQt6Positioning.so.6(Qt_6.2)(64bit) libQt6Positioning.so.6(Qt_6.3)(64bit) libQt6Positioning.so.6(Qt_6.4)(64bit) libQt6Positioning.so.6(Qt_6.5)(64bit) libQt6Positioning.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Positioning6 libQt6Positioning6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
