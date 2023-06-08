SUMMARY = "A time tracker for GNOME"
DESCRIPTION = "Project Hamster is a time tracker for keeping track on how much time \
is spent during the day on activities that are set up."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "3.0.3~1"

RPM_NAME = "hamster-time-tracker-3.0.3~1-7.11.noarch.rpm"
RPM_HASH = "818ecb2d44b654b90f4845f4ce0f34f1d3cc16ebbb0204e716d2d6fb2b403bfc35eecef21b445552565dd74c5308bc74a7be7c2bc9cc3c113985f56fbc2029d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.gnome.Hamster.GUI.desktop) docky-hamster-applet hamster-applet hamster-time-tracker metainfo() metainfo(org.gnome.Hamster.GUI.metainfo.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 intltool python(abi) python3-cairo python3-dbus-python python3-gobject-Gdk python3-pyxdg typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(Pango) typelib(PangoCairo)"

inherit rpm
