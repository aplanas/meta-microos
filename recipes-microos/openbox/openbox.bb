SUMMARY = "ICCCM and EWMH Compliant Window Manager with Very Few Dependencies"
DESCRIPTION = "Openbox is a window manager for the X Window System. It currently runs \
on a large list of platforms. It was originally based on Blackbox, but \
is, since version 3.0, a complete reimplementation with these features, \
among others: \
 \
o ICCCM and EWMH compliance o Chainable key bindings o Customizable \
mouse actions o Window resistance o Multihead Xinerama support o Pipe \
menus \
 \
The configuration tool 'obconf' is recommended along with this package."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-3.6.1-3.31.aarch64.rpm"
RPM_HASH = "cd23fda54175d84781789a5e3efb9b6220549ddcf6b554b96dc5ce10cb245a430032e0d44ca26912397386d3e5ffb6ef9edf262c3c5279e4a4917c3c66fafb12"

RPROVIDES:${PN} += "application() application(openbox.desktop) config(openbox) openbox openbox(aarch-64) windowmanager"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXext.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libobrender.so.32()(64bit) libobt.so.2()(64bit) libstartup-notification-1.so.0()(64bit) xdg-menu xsltproc"

inherit rpm
