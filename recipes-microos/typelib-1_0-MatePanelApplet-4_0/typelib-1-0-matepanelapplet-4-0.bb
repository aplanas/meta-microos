SUMMARY = "Introspection bindings for the MATE panel applet library"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "typelib-1_0-MatePanelApplet-4_0-1.26.2-2.3.aarch64.rpm"
RPM_HASH = "4513e7a8cc2449bd2568a9e967868888d5f2ec6244370c3a75041142ba69650d5ae7933e9e1b5fa208a612e82c4189759020a46fce00f95602fdf24a3aec6270"

RPROVIDES:${PN} += "typelib(MatePanelApplet) typelib-1_0-MatePanelApplet-4_0 typelib-1_0-MatePanelApplet-4_0(aarch-64)"
RDEPENDS:${PN} += "libmate-panel-applet-4.so.1()(64bit) typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
