SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "gtksourceview2-devel-2.10.5-20.9.aarch64.rpm"
RPM_HASH = "79143439ec958b0d1cd8433d20869632997c59cb40bcf59a66c0d8ec22d85191790f83ced58660463a9b9bc052dff7b6a8739070ef64d71f581a63c62e9204b4"

RPROVIDES:${PN} += "gtksourceview-doc gtksourceview2-devel gtksourceview2-devel(aarch-64) pkgconfig(gtksourceview-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gtk2-devel libgtksourceview-2_0-0 libxml2-devel pkgconfig(gtk+-2.0) pkgconfig(libxml-2.0)"

inherit rpm
