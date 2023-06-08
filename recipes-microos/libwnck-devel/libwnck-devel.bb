SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-devel-43.0-3.3.aarch64.rpm"
RPM_HASH = "80c4570aec4d196389b0a0038b3eafb3e7563b6dccbc129c74f230e3b3ab9b5e713adb82e64a8e150ba2d6da59961eba1c3b33aa60e1fbd972b43290ad7789aa"

RPROVIDES:${PN} += "libwnck-devel libwnck-devel(aarch-64) libwnck-doc pkgconfig(libwnck-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwnck-3-0 pkgconfig(cairo) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libstartup-notification-1.0) pkgconfig(pango) pkgconfig(x11) pkgconfig(xres) typelib-1_0-Wnck-3_0"

inherit rpm
