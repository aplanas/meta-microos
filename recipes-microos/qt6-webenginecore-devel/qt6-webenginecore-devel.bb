SUMMARY = "Development files for the Qt 6 WebEngineCore library"
DESCRIPTION = "Development files for the Qt 6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webenginecore-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "1dfe977559069e3d940b89122a41090e74fca65abbcd14c727a957c0d47e09fc9a067710ced1bdfc1319aba652774f68d51f594272598598c7515ee2a093537d"

RPROVIDES:${PN} += "cmake(Qt6WebEngineCore) cmake(Qt6WebEngineCoreTools) pkgconfig(Qt6WebEngineCore) qt6-webenginecore-devel qt6-webenginecore-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6Positioning) cmake(Qt6Quick) cmake(Qt6WebChannel) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6WebEngineCore6 libc.so.6(GLIBC_2.34)(64bit) libevent-2.1.so.7()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Network) pkgconfig(Qt6Positioning) pkgconfig(Qt6Quick) pkgconfig(Qt6WebChannel)"

inherit rpm
