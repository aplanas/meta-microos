SUMMARY = "Align image stack"
DESCRIPTION = "Align multiple exposures using homographic transformation. The command \
uses a similar feature-point based method as most panorama stitching software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsalign-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "b2150cfeb296c957c11f06d1f6cc49016ff26aeed10b19edbb1fb03cb7c32cae05a392d05f9e60606225e8fe399baf8f121f579f0f21e127616c73a02a7e0e9c"

RPROVIDES:${PN} += "pfsalign pfsalign(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libopencv_calib3d.so.407()(64bit) libopencv_core.so.407()(64bit) libopencv_features2d.so.407()(64bit) libopencv_highgui.so.407()(64bit) libopencv_imgproc.so.407()(64bit) libpfs.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
