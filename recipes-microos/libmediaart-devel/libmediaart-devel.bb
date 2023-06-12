SUMMARY = "Development files for the Media Art extraction library"
DESCRIPTION = "The libmediaart library is the foundation for media art caching, \
extraction and lookup for applications on the desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.6"

RPM_NAME = "libmediaart-devel-1.9.6-1.4.aarch64.rpm"
RPM_HASH = "66e49ca0e131fb472f988edcf3c89a3818c5b59842940772745f97fac6d7703af14af43750353555b6210cc528748e0f9c931280c9888dc943592939d16706c9"

RPROVIDES:${PN} += "libmediaart-devel \
libmediaart-devel(aarch-64) \
pkgconfig(libmediaart-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmediaart-2_0-0 \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
typelib-1_0-MediaArt-2_0"

inherit rpm
