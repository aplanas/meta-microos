SUMMARY = "GNOME OpenGPG key signing helper"
DESCRIPTION = "Its purpose is to ease signing other peoples' keys. It is similar \
to caff, PIUS, or monkeysign. In fact, it is influenced a lot by \
these tools and either reimplements ideas or reuses code. \
Consider either of the aboved mentioned tools when you need a much \
more mature codebase."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.7.2"

RPM_NAME = "gnome-keysign-0.9.7.2-2.10.aarch64.rpm"
RPM_HASH = "1cf3129df06daaa779fe54b4fdd58435bc78dc5d7411b2c51b74ee941a47d4c972c52d26479fcdb6ad3716175474b05241a8e80bdfcf56ed3482ec97709e09f0"

RPROVIDES:${PN} += "application() application(org.gnome.Keysign.desktop) gnome-keysign gnome-keysign(aarch-64) metainfo() metainfo(org.gnome.Keysign.appdata.xml) python3.10dist(gnome-keysign) python3dist(gnome-keysign)"
RDEPENDS:${PN} += "/usr/bin/python3 gstreamer1(element-zbar)()(64bit) python(abi) python3-Twisted python3-avahi python3-cairo python3-dbus-python python3-gobject python3-gobject-Gdk python3-gpg python3-pybluez python3-qrcode python3-requests python3-setuptools typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gst) typelib(GstVideo) typelib(Gtk) typelib(Pango)"

inherit rpm
