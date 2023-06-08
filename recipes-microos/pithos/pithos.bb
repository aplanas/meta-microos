SUMMARY = "Native Pandora Radio client for Linux"
DESCRIPTION = "Pithos is a native Pandora Radio client for Linux. It's much more \
lightweight than the Pandora.com web client, and integrates with desktop \
features such as media keys, notifications, and the sound menu."
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "pithos-1.6.0-1.2.noarch.rpm"
RPM_HASH = "b5cabe584d08b7688b99757cacf31c0fa87ee99beb13105f6909a81b825dbf60166600e150875b024ae488b3a69d1be794c445ff9bb77b620c285d6b5006774c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(io.github.Pithos.desktop) metainfo() metainfo(io.github.Pithos.appdata.xml) pithos"
RDEPENDS:${PN} += "/usr/bin/env gstreamer-plugins-bad gstreamer-plugins-good python3-cairo python3-gobject-Gdk typelib(Dbusmenu) typelib(DbusmenuGtk3) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gst) typelib(GstAudio) typelib(GstPbutils) typelib(Gtk) typelib(Keybinder) typelib(Pango) typelib(Secret)"

inherit rpm
