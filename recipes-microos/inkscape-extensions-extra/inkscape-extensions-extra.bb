SUMMARY = "Additional extensions for Inkscape"
DESCRIPTION = "Extra extensions for Inkscape. Recommended for everybody who wants to \
use Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-extra-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "9abc3d9a738c581bf384ccc5600a5631162f86179bd86c21af0220bfeefa604577fb583610494c3482c96c32c3e3e8c310d0d518787b44c32a5ae892aee40741"

RPROVIDES:${PN} += "inkscape-extensions-extra inkscape-extensions-extra(aarch-64)"
RDEPENDS:${PN} += "ghostscript inkscape python3-lxml python3-numpy python3-scour python3-xml typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk) typelib(Pango)"

inherit rpm
