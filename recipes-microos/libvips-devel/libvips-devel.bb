SUMMARY = "Development files for the VIPS library"
DESCRIPTION = "This package contains the development files for developing applications that \
want to make use of the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "libvips-devel-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "d109000f4e294068c1a00aa628242df9eb99bd55eeb2ae91ac1970d6a1d4cfffc945960cafb4e3ee2a191bebc6cc4866e00a2b98a5147f2a7d1a7295a7a48e9d"

RPROVIDES:${PN} += "libvips-devel libvips-devel(aarch-64) pkgconfig(vips) pkgconfig(vips-cpp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvips42 pkgconfig pkgconfig(OpenEXR) pkgconfig(cairo) pkgconfig(cfitsio) pkgconfig(expat) pkgconfig(fftw3) pkgconfig(fontconfig) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-no-export-2.0) pkgconfig(gobject-2.0) pkgconfig(imagequant) pkgconfig(lcms2) pkgconfig(libexif) pkgconfig(libgsf-1) pkgconfig(libjpeg) pkgconfig(libopenjp2) pkgconfig(libpng) pkgconfig(librsvg-2.0) pkgconfig(libtiff-4) pkgconfig(libwebp) pkgconfig(libwebpdemux) pkgconfig(libwebpmux) pkgconfig(matio) pkgconfig(orc-0.4) pkgconfig(pangocairo) pkgconfig(pangoft2) pkgconfig(vips) pkgconfig(zlib)"

inherit rpm
