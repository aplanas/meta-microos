SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-2.0-only"

PV = "3.4.18"

RPM_NAME = "opencv3-3.4.18-2.5.aarch64.rpm"
RPM_HASH = "aa7c81b9f778bf8284a1a12118ff9463d4b13c6753f39284c3b49ace16e9f57bdf22b3e825f41c828f1aabf88f943d78ee61bf5626fc19ba221ac658ded5c332"

RPROVIDES:${PN} += "opencv-qt5 opencv3 opencv3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopencv_calib3d.so.3.4()(64bit) libopencv_core.so.3.4()(64bit) libopencv_features2d.so.3.4()(64bit) libopencv_highgui.so.3.4()(64bit) libopencv_imgcodecs.so.3.4()(64bit) libopencv_imgproc.so.3.4()(64bit) libopencv_videoio.so.3.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
