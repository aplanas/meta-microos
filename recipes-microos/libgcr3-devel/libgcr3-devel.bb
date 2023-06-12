SUMMARY = "Development files for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgcr3-devel-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "9c7f5205a8d60db77ca08aebf18a03a49296c40a9dd881404af326a7afb4fa347f61fb639765c0dc67bb579741f2496912850ebee3a8f5b0f7588c719d7fe089"

RPROVIDES:${PN} += "libgcr3-devel \
libgcr3-devel(aarch-64) \
pkgconfig(gcr-3) \
pkgconfig(gcr-base-3) \
pkgconfig(gcr-ui-3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcr-3-1 \
pkgconfig(gck-1) \
pkgconfig(gcr-base-3) \
pkgconfig(gcr-ui-3) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(p11-kit-1) \
typelib-1_0-Gcr-3 \
typelib-1_0-GcrUi-3"

inherit rpm
