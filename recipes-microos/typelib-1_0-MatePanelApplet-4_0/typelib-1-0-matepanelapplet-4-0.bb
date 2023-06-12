SUMMARY = "Introspection bindings for the MATE panel applet library"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "typelib-1_0-MatePanelApplet-4_0-1.26.3-1.1.aarch64.rpm"
RPM_HASH = "d8a25af509b35be52907512a9582031bd6e0a0698f1d1216077d9129ca94ea99ddc82d096052500373e0a54a6c15fa6b2a6e43a2d47c99d7687ba132860e7956"

RPROVIDES:${PN} += "typelib(MatePanelApplet) \
typelib-1_0-MatePanelApplet-4_0 \
typelib-1_0-MatePanelApplet-4_0(aarch-64)"
RDEPENDS:${PN} += "libmate-panel-applet-4.so.1()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
