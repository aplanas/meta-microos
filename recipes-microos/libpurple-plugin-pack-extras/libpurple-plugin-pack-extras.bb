SUMMARY = "Compilation of plugins for libpurple -- GPLv3+ Plugins"
DESCRIPTION = "The Purple Plugin Pack is a compilation of plugins for the \
libpurple family of IM clients. \
 \
This package contains GPLv3+ plugins. Their licence might cause \
incompatibilities with other plugins."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "libpurple-plugin-pack-extras-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "14a950e4cd10d855e35f54b4e2e140a90e9b698f2cd316aae9e897fb0cea394b5ff42d3f42601d1bf46d3007bbbce2da78de2d23eadeec412b0042c89399757d"

RPROVIDES:${PN} += "libpurple-plugin-pack-extras libpurple-plugin-pack-extras(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpurple-plugin-pack libpurple.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
