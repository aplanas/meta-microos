SUMMARY = "CAD Program for the Design of Printed Circuit Boards"
DESCRIPTION = "pcb is a CAD (computer aided design) program for the physical design \
of printed circuit boards.  It has an autorouter, a trace optimizer a \
design rule checker and many more features. It can create RS-274-X \
(Gerber), Postscript, EPS and PNG output files."
LICENSE = "GPL-2.0-only"

PV = "4.3.0"

RPM_NAME = "pcb-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "da271665089d8285382a43eebba289ec8cbf0a81504debcff02562b661eee0b2f0f72ba06aecbe63632d378c66f872454c5101d2d57f9cdf7492355500299b03"

RPROVIDES:${PN} += "application() application(pcb.desktop) metainfo() metainfo(pcb.appdata.xml) mimehandler(application/x-pcb-footprint) mimehandler(application/x-pcb-layout) pcb pcb(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl /usr/bin/tclsh /usr/bin/wish ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgd.so.3()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgdkglext-x11-1.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libgtkglext-x11-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) m4"

inherit rpm
