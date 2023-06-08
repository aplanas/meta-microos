SUMMARY = "The FLTK GUI toolkit library"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "libfltk1_3-1.3.8-3.8.aarch64.rpm"
RPM_HASH = "63d8eb24d69432286f1ea21c5dbb4e2d66cab9aca1f63f169162af427c572fd189279c44c52a720a65ae0d55197bc5fb1a4edfac9a98131c2d8707c437fcc317"

RPROVIDES:${PN} += "libfltk.so.1.3()(64bit) libfltk1_3 libfltk1_3(aarch-64) libfltk_forms.so.1.3()(64bit) libfltk_gl.so.1.3()(64bit) libfltk_images.so.1.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXft.so.2()(64bit) libXinerama.so.1()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
