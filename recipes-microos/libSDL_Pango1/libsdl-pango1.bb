SUMMARY = "Programming Pango via SDL"
DESCRIPTION = "Pango is the text rendering engine of GNOME 2.x. SDL_Pango connects the \
engine to SDL."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.2"

RPM_NAME = "libSDL_Pango1-0.1.2-240.5.aarch64.rpm"
RPM_HASH = "a4bf694b53840edf6543acb24dcd9d75c9c9624847641e54e828c157045e92ceb21129bcc3d77343f4b23a2ec8c91bf48cb447a1cb9c9cc9cfb9f9875d52a634"

RPROVIDES:${PN} += "libSDL_Pango.so.1()(64bit) \
libSDL_Pango1 \
libSDL_Pango1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit)"

inherit rpm
