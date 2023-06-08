SUMMARY = "Configuration UI for gaming mice"
DESCRIPTION = "Piper is a GTK+ application to configure gaming mice. It is a graphical frontent \
to the ratbagd DBUS daemon which provides the actual configuration support for the \
devices."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "piper-0.7-1.3.noarch.rpm"
RPM_HASH = "5efebc712f66dbde81a264741036c9494272dc94e23f2d34fce1f2809ce13bf73f84fac9aa974e366a989266c194476036e8e648fb201f6b69deb125559e2cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.freedesktop.Piper.desktop) metainfo() metainfo(org.freedesktop.Piper.appdata.xml) piper"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-cairo python3-evdev python3-gobject python3-gobject-Gdk python3-lxml ratbagd typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(Rsvg)"

inherit rpm
