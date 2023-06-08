SUMMARY = "Image format plugins for Qt"
DESCRIPTION = "This framework provides additional image format plugins for QtGui.  As \
such it is not required for the compilation of any other software, but \
may be a runtime requirement for Qt-based software to support certain \
image formats."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kimageformats-5.105.0-2.1.aarch64.rpm"
RPM_HASH = "7ba21b5739886937625a674f45a1d2d38327b39294ba4a10a2334dea89d7ea9632b19409436102f790b886b217335aff1c2d80ed5b4837cbbe96cc945e939f6e"

RPROVIDES:${PN} += "kimageformats kimageformats(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libIex-3_1.so.30()(64bit) libImath-3_1.so.29()(64bit) libKF5Archive.so.5()(64bit) libOpenEXR-3_1.so.30()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui5 libQt5PrintSupport5 libavif.so.15()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libheif.so.1()(64bit) libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libraw.so.23()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
