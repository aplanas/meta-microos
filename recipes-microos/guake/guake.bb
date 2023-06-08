SUMMARY = "Drop-down terminal for GNOME"
DESCRIPTION = "Guake is a dropdown terminal made for the GNOME desktop environment."
LICENSE = "GPL-2.0-only"

PV = "3.9.0"

RPM_NAME = "guake-3.9.0-1.3.noarch.rpm"
RPM_HASH = "2e136931de3a1fb84a0a4f9198f723dd4977ea0d049e4251affd68b8617798e0230cc9af8bd3ac782fce08ab6f99f8a02427a516376de3d02ae145087b7481d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(guake-prefs.desktop) application(guake.desktop) guake metainfo() metainfo(guake.desktop.metainfo.xml) python3.10dist(guake) python3dist(guake)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-cairo python3-dbus-python python3-gobject-Gdk typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkX11) typelib(Gio) typelib(Gtk) typelib(Keybinder) typelib(Notify) typelib(Pango) typelib(Vte) typelib(Wnck)"

inherit rpm
