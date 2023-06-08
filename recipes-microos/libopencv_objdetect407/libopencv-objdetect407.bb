SUMMARY = "Face detection libraries for OpenCV"
DESCRIPTION = "Object detection libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "libopencv_objdetect407-4.7.0-1.6.aarch64.rpm"
RPM_HASH = "a72f131dd1d67fbdd102e0253fda5b8eb24d0b06ada79186922d6d317cd897e6b4333fd43d6a33619adfac99eff5e9e936e3bfe73664c6ba7b379f170e8d6902"

RPROVIDES:${PN} += "libopencv_objdetect.so.407()(64bit) libopencv_objdetect407 libopencv_objdetect407(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopencv_calib3d.so.407()(64bit) libopencv_core.so.407()(64bit) libopencv_dnn.so.407()(64bit) libopencv_imgproc.so.407()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) opencv4-cascades-data"

inherit rpm
