SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-Gdk-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "0d9fc5861c5ccaf6dad7834abaa48db69a691f06e5aad0a9113ba98d57a1bb929a659c44dc5c887d824e2c5f1c85809e30ae796d8348917ad959a24d283856d3"

RPROVIDES:${PN} += "python3-gobject-Gdk python310-gobject-Gdk python310-gobject-Gdk(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-gobject python310-gobject-cairo typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(GdkX11) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(cairo)"

inherit rpm
