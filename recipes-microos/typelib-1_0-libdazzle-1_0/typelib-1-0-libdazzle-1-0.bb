SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Introspection bindings"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone.. \
 \
This package provides the GObject Introspection bindings for libdazzle."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "typelib-1_0-libdazzle-1_0-3.44.0-1.7.aarch64.rpm"
RPM_HASH = "20b9bb5e2935d7a5822e6345ba635953d607b1024edc6b7bd3a7ba69a4f2600a7d14ebd6852b4012d7ca72093ca2b1bcc983ccb13ec0a18178b2f459d683a374"

RPROVIDES:${PN} += "typelib(Dazzle) typelib-1_0-libdazzle-1_0 typelib-1_0-libdazzle-1_0(aarch-64)"
RDEPENDS:${PN} += "libdazzle-1.0.so.0()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
