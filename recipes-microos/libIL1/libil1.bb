SUMMARY = "A cross-platform image library"
DESCRIPTION = "Developer's Image Library (DevIL) is a programmer's library to \
develop applications with image loading capabilities. Control of \
images is left to the developer, so unnecessary conversions, etc. are \
not performed. DevIL can load, save, convert, manipulate, filter and \
display a wide variety of image formats. \
 \
Currently, DevIL can load .bmp, .cut, .dds, .doom, .gif, .ico, .jpg, \
.lbm, .mdl, .mng, .pal, .pbm, .pcd, .pcx, .pgm, .pic, .png, .ppm, \
.psd, .psp, .raw, .sgi, .tga and .tif .hdr files. \
Formats supported for saving include .bmp, .dds, .h, .jpg, .pal, \
.pbm, .pcx, .hdr, .pgm,.png, .ppm, .raw, .sgi, .tga and .tif. \
 \
DevIL currently supports the following APIs for display: OpenGL, \
SDL and Allegro."
LICENSE = "LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "libIL1-1.7.8-11.11.aarch64.rpm"
RPM_HASH = "4fe69daef8af54c38dd3e0adc41b828ec37611e1ea17e15f02d65fdc98cc2c8ab49b43c704d9052242ae3d2201861c293948d2cb878d615314b3b56261e6d645"

RPROVIDES:${PN} += "libIL.so.1()(64bit) libIL1 libIL1(aarch-64) libILU.so.1()(64bit) libILUT.so.1()(64bit) libdevil1"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libImath-3_1.so.29()(64bit) libOpenEXR-3_1.so.30()(64bit) libSDL-1.2.so.0()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmng.so.2()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
