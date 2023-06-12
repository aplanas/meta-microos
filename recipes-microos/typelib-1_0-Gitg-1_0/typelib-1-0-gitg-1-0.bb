SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "typelib-1_0-Gitg-1_0-41-2.8.aarch64.rpm"
RPM_HASH = "ab784a6e1a0f63b3a588f86d701da725b1d69dc736c5f227791e35a2261c8f7763ad4897923b566bc07dbc4fd8cccbd42c50447eba6271f81de853f61c04972c"

RPROVIDES:${PN} += "typelib(Gitg) \
typelib-1_0-Gitg-1_0 \
typelib-1_0-Gitg-1_0(aarch-64)"
RDEPENDS:${PN} += "libgitg-1.0.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gee) \
typelib(Ggit) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
