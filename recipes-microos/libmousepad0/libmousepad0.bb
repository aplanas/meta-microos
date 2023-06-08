SUMMARY = "Mousepad plugin provider"
DESCRIPTION = "A plugin provider for the Mousepad text editor"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "libmousepad0-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "c3cb2bd929e59dca7313b379188b2f11ac741e5ae6f6852f2c888874a23d62789812cd65b01509c1d9e25eb7720424b24a75c496c7cff7f24f2cdba9cfff3793"

RPROVIDES:${PN} += "libmousepad.so.0()(64bit) libmousepad0 libmousepad0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpango-1.0.so.0()(64bit) mousepad"

inherit rpm
