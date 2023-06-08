SUMMARY = "GTK based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing GTK based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-ui-gtk-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "6384f878e364b0c73fc64052c453d8734216bb2a7aaae0c2b527f6a870f96945054d68f26ff7ff82fb90cac5b2c3758153952dbe77a7878d4f2076430374f0dc"

RPROVIDES:${PN} += "qemu-ui-gtk qemu-ui-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libepoxy.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpixman-1.so.0()(64bit) libvte-2.91.so.0()(64bit) qemu-ui-opengl"

inherit rpm
