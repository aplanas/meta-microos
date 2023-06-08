SUMMARY = "GTK+ and GNOME bindings for Mono (virtual package)"
DESCRIPTION = "Gtk# is a library that allows you to build fully native graphical GNOME \
applications using Mono. Gtk# is a binding to GTK+, the cross platform \
user interface toolkit used in GNOME. It includes bindings for Gtk, \
Atk, Pango, Gdk, libgnome, libgnomeui and libgnomecanvas.  (Virtual \
package which depends on all gtk-sharp2 subpackages)"
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-complete-2.12.45-3.8.aarch64.rpm"
RPM_HASH = "9bdc3c91f93441b28b50c12fe650ca79fbc4bac1904dc23f39412e5bb29c5799c7e837516ca94042b2acf6dbd5c64ff012a3430193bd7ec99bd7465c98135fdc"

RPROVIDES:${PN} += "gtk-sharp2-complete gtk-sharp2-complete(aarch-64)"
RDEPENDS:${PN} += "glade-sharp2 glib-sharp2 gtk-sharp2 gtk-sharp2-doc gtk-sharp2-gapi"

inherit rpm
