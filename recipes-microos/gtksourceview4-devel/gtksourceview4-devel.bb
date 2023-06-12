SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "gtksourceview4-devel-4.8.4-1.3.aarch64.rpm"
RPM_HASH = "a7f8738b5caf1021f8d33c39366c8d2dbd9b3abb7139a82c4ea3e6a8e268ed10ce72140862177885cb23d8e50cad3a81dbf4a86cdeb2f91322b83c626ad7a2bd"

RPROVIDES:${PN} += "gtksourceview4-devel \
gtksourceview4-devel(aarch-64) \
pkgconfig(gtksourceview-4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceview-4-0 \
libgtksourceview4 \
pkgconfig(fribidi) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-GtkSource-4"

inherit rpm
