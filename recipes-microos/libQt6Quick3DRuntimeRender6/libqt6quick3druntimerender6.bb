SUMMARY = "Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "The Qt 6 Quick3DRuntimeRender library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DRuntimeRender6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8466109a8c6050d279111083cf5778b9decf36727692be02e6cbbd0bdb2abe85066fc42a2f579e2f9276df5fc06c3553a19823d39d38aec77565ff859c690dfb"

RPROVIDES:${PN} += "libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.0)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.1)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.2)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.3)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.4)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5)(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender6 libQt6Quick3DRuntimeRender6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6)(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6ShaderTools.so.6()(64bit) libQt6ShaderTools.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
