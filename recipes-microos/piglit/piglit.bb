SUMMARY = "OpenGL driver testing framework"
DESCRIPTION = "Piglit is a collection of automated tests for OpenGL and OpenCL \
implementations. \
 \
The goal of Piglit is to help improve the quality of open source \
OpenGL drivers by providing developers with means to perform \
regression tests. \
 \
It contains the Glean tests, some tests adapted from Mesa, as well as \
some specific regression tests for certain bugs. HTML summaries can \
be generated, including the ability to compare different test runs."
LICENSE = "MIT"

PV = "1~20210326.6a4be9e99"

RPM_NAME = "piglit-1~20210326.6a4be9e99-3.3.aarch64.rpm"
RPM_HASH = "31d2f95ff4729a735fa57ce536c9ef87111d81f25cb60cd2d6bf44ba57003746d89184ca42f0fcd44fa4a6a3186859c8d3b6fd56f555ab08e351ba41af6a9668"

RPROVIDES:${PN} += "libpiglitutil.so.0()(64bit) libpiglitutil_gles1.so.0()(64bit) libpiglitutil_gles2.so.0()(64bit) libpiglitutil_gles3.so.0()(64bit) piglit piglit(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libdrm_intel.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwaffle-1.so.0()(64bit) libxcb-dri2.so.0()(64bit) libxcb.so.1()(64bit) python3 python3-Mako python3-numpy python3-xml"

inherit rpm
