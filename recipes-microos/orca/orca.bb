SUMMARY = "Screen reader for GNOME"
DESCRIPTION = "Orca is an extensible screen reader that provides access to the \
graphical desktop via user-customizable combinations of speech, \
braille, and/or magnification."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "orca-44.0-1.1.noarch.rpm"
RPM_HASH = "f1e1cc52825c07e81b07f72c546d8a50a5323caf83233fa7bdb42cc57a0e2d4a0f10a7d96ee39773864d0693db1d49304fb186c428ab2320d648b6480f2bd165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orca"
RDEPENDS:${PN} += "/usr/bin/python3 glib2-tools py3atspi python(abi) python3-brlapi python3-gobject python3-gobject-Gdk python3-louis python3-speechd typelib(Atk) typelib(Atspi) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkX11) typelib(Gio) typelib(Gst) typelib(Gtk) typelib(Pango) typelib(Wnck)"

inherit rpm
