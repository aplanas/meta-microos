SUMMARY = "Development files for libgdata, a library for accessing online service APIs"
DESCRIPTION = "libgdata is a GLib-based library for accessing online service APIs using \
the GData protocol. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgdata."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "libgdata-devel-0.18.1-3.3.aarch64.rpm"
RPM_HASH = "33c12d4d0caba014e734c605c475caa1e45a3d16b877e90dd859ecee532a0df49a09b530add1f4b27ce0e72f79d71175504d602c457c59270d67835661691f83"

RPROVIDES:${PN} += "libgdata-devel \
libgdata-devel(aarch-64) \
pkgconfig(libgdata)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdata22 \
pkgconfig(gcr-4) \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(goa-1.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gthread-2.0) \
pkgconfig(json-glib-1.0) \
pkgconfig(libsoup-2.4) \
pkgconfig(libxml-2.0) \
typelib-1_0-GData-0_0"

inherit rpm
