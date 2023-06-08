SUMMARY = "Desktop menu editor"
DESCRIPTION = "A desktop menu editor. Budgie, Cinnamon, GNOME, KDE (Plasma), LXDE, LXQt, MATE, \
Pantheon, Unity, and Xfce are supported."
LICENSE = "GPL-3.0-only"

PV = "2.2.3"

RPM_NAME = "menulibre-2.2.3-1.7.noarch.rpm"
RPM_HASH = "a2f828866e8dcfb9b0e6aa61b03e221014e120f7ceff4ba778d0c23235a659b9e177c98b56101958ecdf70c938d4ca6ec4fe4acf5a0223dba5098b227d54b429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(menulibre.desktop) menulibre metainfo() metainfo(menulibre.appdata.xml) python3.10dist(menulibre) python3dist(menulibre)"
RDEPENDS:${PN} += "/usr/bin/python3 gnome-menus hicolor-icon-theme python(abi) python3 python3-gobject python3-psutil typelib(GLib) typelib(GMenu) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(Pango) xdg-utils"

inherit rpm
