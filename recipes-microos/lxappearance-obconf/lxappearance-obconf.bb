SUMMARY = "Lxappearance Plugin to Configure Openbox"
DESCRIPTION = "ObConf is a program used to configure OpenBox window manager developed \
by Dana Jansens, Tim Riley, and Javeed Shaikh. LXAppearance is a tool \
used to configure look and feels of the desktop written by Hong Jen Yee \
for LXDE project. This plugin is derived from ObConf as an attempt to \
integrate obconf with LXAppearance to provide a better user experience. \
Most of the source code are taken from ObConf written by its authors \
with some modifications added by LXAppearance developers to make it a \
plugin."
LICENSE = "GPL-2.0"

PV = "0.2.3"

RPM_NAME = "lxappearance-obconf-0.2.3-1.26.aarch64.rpm"
RPM_HASH = "dbe85cce9b7216126e8936a7226137591ead1e6e12d9cd8128c7ccbb981c658ce01c43b4ac7fb08f38a1e05b1986d3a67095a16ddd0737b1a62b68361b94d0e5"

RPROVIDES:${PN} += "lxappearance-obconf lxappearance-obconf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libobrender.so.32()(64bit) libobt.so.2()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) lxappearance openbox"

inherit rpm
