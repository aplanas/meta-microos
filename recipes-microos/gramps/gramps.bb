SUMMARY = "Genealogical Research Software"
DESCRIPTION = "Gramps gives you the ability to record the many details of an \
individual's life as well as the complex relationships between \
various people, places and events. All of your research is kept \
organized, searchable and as precise as you need it to be."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.5"

RPM_NAME = "gramps-5.1.5-1.7.noarch.rpm"
RPM_HASH = "088f11f9b048283cd388d1d27ccd7df88f19a9e6a0564eb438b95221945b764218b25aa7c4765897058dc4543c1bfba0e4688890be56ee4fe507968be9e77ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(gramps.desktop) gramps metainfo() metainfo(gramps.appdata.xml) mimehandler(application/x-gedcom) mimehandler(application/x-gramps) mimehandler(application/x-gramps-package) mimehandler(application/x-gramps-xml) python3.10dist(gramps) python3dist(gramps)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-bsddb3 python3-cairo python3-gobject python3-gobject-Gdk typelib(GExiv2) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(GeocodeGlib) typelib(Gio) typelib(Gtk) typelib(GtkSpell) typelib(OsmGpsMap) typelib(Pango) typelib(PangoCairo) xdg-utils"

inherit rpm
