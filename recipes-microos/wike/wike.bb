SUMMARY = "A Wikipedia reader for the GNOME Desktop"
DESCRIPTION = "Wike is a Wikipedia reader for the GNOME Desktop. Provides access to all the \
content of this online encyclopedia in a native application, with a simpler and \
distraction-free view of articles."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "wike-2.0.1-1.1.noarch.rpm"
RPM_HASH = "c22e2c0a3a0f7687292e0a8ee3d679558951dbac6da04072b50d425d73e9d7ce0f4d3fbfddd91cb537ec6ca4f68f464b884cf64fdf969c55c1e2d1d9dbd43aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(com.github.hugolabe.Wike.desktop) \
metainfo() \
metainfo(com.github.hugolabe.Wike.metainfo.xml) \
wike"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
typelib(Adw) \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(WebKit)"

inherit rpm
