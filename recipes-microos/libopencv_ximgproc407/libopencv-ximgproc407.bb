SUMMARY = "Image processing libraries for OpenCV"
DESCRIPTION = "Image processing libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_ximgproc407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "16071d83c00be6f60774d193373cd83aa3dd006c9e9bd01ac56addc8e1dc7ede9c200d0c6a386f36f0754f1a302feb731a38f6ac031ac39a373e64920c5d174e"

RPROVIDES:${PN} += "libopencv_ximgproc.so.407()(64bit) libopencv_ximgproc407 libopencv_ximgproc407(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopencv_calib3d.so.407()(64bit) libopencv_core.so.407()(64bit) libopencv_imgcodecs.so.407()(64bit) libopencv_imgproc.so.407()(64bit) libopencv_video.so.407()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
