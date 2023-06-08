SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "libCoin80-4.0.0-1.7.aarch64.rpm"
RPM_HASH = "0f6a41a433862495cf6bf3012224278856d6cdd7937ae7244f1f5f538fd5308cdca7ef5f48f98facd2de0ef2dbf67f771f890b0633a651c4bf7f5b242b37abcd"

RPROVIDES:${PN} += "libCoin.so.80()(64bit) libCoin80 libCoin80(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenGL.so.0()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libexpat.so.1()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
