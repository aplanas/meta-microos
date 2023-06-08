SUMMARY = ".NET/C-Sharp Bindings for GIO"
DESCRIPTION = "Files for developing programs using the C-Sharp bindings for Gtk+, Gdk, Atk, and Pango."
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "gtk-sharp3-devel-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "70d1dc2913a4a5ad08c2dfccb06ad966288740a4f0ff86bcababba7d2cca2d27c24504154cc7f1649790a8445ee2f88c2e24dc79cd02148fe4b60c18b8f6cdc9"

RPROVIDES:${PN} += "gtk-sharp3-devel gtk-sharp3-devel(aarch-64) pkgconfig(gdk-sharp-3.0) pkgconfig(glib-sharp-3.0) pkgconfig(gtk-dotnet-3.0) pkgconfig(gtk-sharp-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gtk-sharp3 pkgconfig(gdk-sharp-3.0) pkgconfig(gio-sharp-3.0) pkgconfig(glib-sharp-3.0) pkgconfig(gtk-sharp-3.0)"

inherit rpm
