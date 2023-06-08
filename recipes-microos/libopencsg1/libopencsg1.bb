SUMMARY = "Constructive Solid Geometry rendering library"
DESCRIPTION = "OpenCSG is a library that does image-based Constructive Solid \
Geometry rendering using OpenGL. CSG denotes an approach to model 3D \
shapes by applying operations such as union, intersection or \
subtraction to so-called primtives, the latter of which are solid \
(i.e. have a clearly defined interior and exterior)."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "libopencsg1-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "7f70a69583e66f99e2df7feec26b81d4916778565472fe518d50780083a98e57a0a64086797929f937ae4ad3079144efaf7335df89dc210197a8346fda404f10"

RPROVIDES:${PN} += "libopencsg.so.1()(64bit) libopencsg1 libopencsg1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libGL.so.1()(64bit) libGLEW.so.2.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
