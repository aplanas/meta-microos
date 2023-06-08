SUMMARY = "User profile configuration utility"
DESCRIPTION = "Mugshot is a user configuration utility that allows \
updating personal user details and avatar."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "mugshot-0.4.3-1.10.noarch.rpm"
RPM_HASH = "41abcf86048afd3c12fbf1b63854571c8944e2f276475ff77148d9ead632643ec4d100af57dd51cf32251219970f3615b3d2007984f58d46f30dfada3c515231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.bluesabre.Mugshot.desktop) metainfo() metainfo(mugshot.appdata.xml) mugshot python3.10dist(mugshot) python3dist(mugshot)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3 python3-base python3-cairo python3-dbus-python python3-gobject python3-gobject-Gdk python3-pexpect typelib(Cheese) typelib(Clutter) typelib(GLib) typelib(GObject) typelib(GdkPixbuf) typelib(Gio) typelib(Gst) typelib(Gtk) typelib(GtkClutter)"

inherit rpm
