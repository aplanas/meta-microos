SUMMARY = "Toolkit to write Gtk+3-based frontends to libretro"
DESCRIPTION = "retro-gtk wraps the libretro API for use in Gtk applications such as \
GNOME Games. \
(libretro is an API specification implemented by some emulator \
libraries like libretro-bsnes.)"
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "libretro-gtk-1-0-1.0.2-2.7.aarch64.rpm"
RPM_HASH = "a0dcfe29aa70ba32c1ae836b273ed5febb9a82d1ce967125a743a50c07122ae877901d7dcec29ab30c2b5e75a60073e186952c1f01e5de19404e9ff77ea89c7f"

RPROVIDES:${PN} += "libretro-gtk-1-0 \
libretro-gtk-1-0(aarch-64) \
libretro-gtk-1.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libepoxy.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
retro-gtk"

inherit rpm
