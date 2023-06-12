SUMMARY = "Utilities for working with HDR images in OpenEXR format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. This package \
contains a set of utilities to work with this format. \
 \
* exrheader, a utility for dumping header information \
* exrstdattr, a utility for modifying OpenEXR standard attributes \
* exrmaketiled, for generating tiled and rip/mipmapped images \
* exrenvmap, for creating OpenEXR environment maps \
* exrmakepreview, for creating preview images for OpenEXR files \
* exr2aces, converter to ACES format \
* exrmultiview, combine two or more images into one multi-view"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "openexr-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "71646df802e6d6b3a675dd02abe33444c609d6a8f57a0679fef7d7a14c8c81976303adb624ff1fd975d915e78ce95127b82fd5938cdded646a52ccf2c8e0d860"

RPROVIDES:${PN} += "OpenEXR \
openexr \
openexr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libIex-3_1.so.30()(64bit) \
libImath-3_1.so.29()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libOpenEXRCore-3_1.so.30()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
