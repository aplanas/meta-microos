SUMMARY = "Qt 6 ShaderTools library"
DESCRIPTION = "The Qt 6 ShaderTools library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6ShaderTools6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "548d2a91d9aeda29fd84f832c7e00cce6f3514ae3de520c650f5f7df66ea500d84b81827fe0e1625c21ca1e0dad49a6f0f42db31debe714ca54624a75ed02fb5"

RPROVIDES:${PN} += "libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6)(64bit) libQt6ShaderTools.so.6(Qt_6.0)(64bit) libQt6ShaderTools.so.6(Qt_6.1)(64bit) libQt6ShaderTools.so.6(Qt_6.2)(64bit) libQt6ShaderTools.so.6(Qt_6.3)(64bit) libQt6ShaderTools.so.6(Qt_6.4)(64bit) libQt6ShaderTools.so.6(Qt_6.5)(64bit) libQt6ShaderTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ShaderTools6 libQt6ShaderTools6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
