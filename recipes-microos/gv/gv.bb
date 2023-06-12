SUMMARY = "A Program to View PostScript Files"
DESCRIPTION = "GV offers you an X Window System GUI for viewing PostScript files. This \
is an X Window System interface to ghostscript. \
 \
 \
 \
Authors: \
-------- \
    Tim Theisen <tim@cs.wisc.edu> \
    Johannes Plass <plass@dipmza.physik.uni-mainz.de>"
LICENSE = "GPL-3.0-or-later"

PV = "3.7.4"

RPM_NAME = "gv-3.7.4-5.20.aarch64.rpm"
RPM_HASH = "b8f6549a9b0b529246032675b2cefc9c92a37864976cb0011b4d479265401c921b21bd0fbfd48f068999b73b78f5284c9ea5dfdf26363a0ef4cbd5104e8c924f"

RPROVIDES:${PN} += "application() \
application(gv.desktop) \
config(gv) \
gv \
gv(aarch-64) \
mimehandler(application/illustrator) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(image/x-eps)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ghostscript_x11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXinerama.so.1()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libzio.so.1()(64bit)"

inherit rpm
