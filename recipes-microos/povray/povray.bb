SUMMARY = "Persistence of Vision Raytracer"
DESCRIPTION = "The Persistence of Vision Ray tracer creates three-dimensional, \
photo-realistic images using a rendering technique called ray tracing. \
It reads in a text file containing information describing the objects \
and lighting in a scene and generates an image of that scene from the \
view point of a camera also described in the text file. Ray tracing is \
not a fast process by any means, (the generation of a complex image can \
take several hours) but it produces very high quality images with \
realistic reflections, shading, perspective, and other effects."
LICENSE = "AGPL-3.0-or-later & CC-BY-SA-3.0"

PV = "3.7.0.10"

RPM_NAME = "povray-3.7.0.10-1.8.aarch64.rpm"
RPM_HASH = "33554effcc175f91942f1d604696d2f737ee0b6a972cb82a94e3cef107df839d4434e5d21e2705451aaeaefde1de8ec79121d0c90727e9b80f1b2eab2241908a"

RPROVIDES:${PN} += "config(povray) povray povray(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImath-3_1.so.29()(64bit) libOpenEXR-3_1.so.30()(64bit) libSDL-1.2.so.0()(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libz.so.1()(64bit)"

inherit rpm
