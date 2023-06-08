SUMMARY = "A morphing program"
DESCRIPTION = "This morphing program reads two images in Targa format and computes the \
transitions from one image to the other (arbitrarily many steps). To \
avoid a simple fading effect, the program needs information about the \
shapes contained in the two images. This is done by using a grid \
consisting of connected checkpoints. The source grid is then \
transformed into the destination grid during the morphing process."
LICENSE = "GPL-2.0-or-later"

PV = "20060817"

RPM_NAME = "xmorph-20060817-250.9.aarch64.rpm"
RPM_HASH = "0be3bc7284d58562cd95b81a143ff166b7e40ab0e5f539924df4ddae8f44afdaeb9033ea70ce3315e45da7ce336a9341667ee68a5d3cccecec4e6555fbd0e230"

RPROVIDES:${PN} += "application() application(xmorph.desktop) libmorph.so.1()(64bit) xmorph xmorph(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) update-desktop-files"

inherit rpm
