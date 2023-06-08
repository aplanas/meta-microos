SUMMARY = "Python bindings for GObject/Gdk"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Gdk bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-Gdk-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "84ad0d90746d4addcb269182fafed64f431306b613551a488e1592cd2f27c88c8d52335ee5e5eb20d9318f3e432a8311daabfcfa3ed050b31183216f65858862"

RPROVIDES:${PN} += "python311-gobject-Gdk python311-gobject-Gdk(aarch-64)"
RDEPENDS:${PN} += "python(abi) python311-gobject python311-gobject-cairo typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(GdkX11) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(cairo)"

inherit rpm
