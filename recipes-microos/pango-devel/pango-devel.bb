SUMMARY = "Development files for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.50.14"

RPM_NAME = "pango-devel-1.50.14-1.3.aarch64.rpm"
RPM_HASH = "64cd518fea08cdf7f70c06634f6665eecb92605ae3ea567a705a0c89e664ebf7d5617737399bb12d02a08905e3e9f5cfca50c4012fc6c8b889429a1defe138c1"

RPROVIDES:${PN} += "pango-devel \
pango-devel(aarch-64) \
pango-doc \
pkgconfig(pango) \
pkgconfig(pangocairo) \
pkgconfig(pangofc) \
pkgconfig(pangoft2) \
pkgconfig(pangoot) \
pkgconfig(pangoxft) \
rpm_macro(pango_module_post) \
rpm_macro(pango_module_postun) \
rpm_macro(pango_module_requires)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpango-1_0-0 \
pkgconfig(cairo) \
pkgconfig(fontconfig) \
pkgconfig(freetype2) \
pkgconfig(fribidi) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(harfbuzz) \
pkgconfig(harfbuzz-gobject) \
pkgconfig(libthai) \
pkgconfig(pango) \
pkgconfig(pangoft2) \
pkgconfig(xft) \
pkgconfig(xrender) \
typelib-1_0-Pango-1_0"

inherit rpm
