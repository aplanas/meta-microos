SUMMARY = "The glib binding library for urfkill"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop. \
http://freedesktop.org/wiki/Software/urfkill"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "liburfkill-glib-devel-0.5.0-3.6.aarch64.rpm"
RPM_HASH = "f8af711ce6f7388392d830283070658ecc661806b31137d0c243102b277ac33538ab42c893c369dba47ac563f32543a6b5c13cdacc119ac452bf593f2f01c1a5"

RPROVIDES:${PN} += "liburfkill-glib-devel liburfkill-glib-devel(aarch-64) pkgconfig(urfkill-glib) urfkill-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config glib2-devel liburfkill-glib0 pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gthread-2.0) typelib-1_0-Urfkill-0_0"

inherit rpm
