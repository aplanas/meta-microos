SUMMARY = "Introspection bindings for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "typelib-1_0-Pluma-1_0-1.26.0-2.5.aarch64.rpm"
RPM_HASH = "ffc6d411037e60ae39cf66b4c496b345f594acea1058a2a8a6ecc534aed704d2b53d369cc6f7da7f5c59446982c13879c74f9ab443979d68a3219376a8c8b674"

RPROVIDES:${PN} += "typelib(Pluma) typelib-1_0-Pluma-1_0 typelib-1_0-Pluma-1_0(aarch-64)"
RDEPENDS:${PN} += "pluma typelib(Atk) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) typelib(GtkSource) typelib(HarfBuzz) typelib(Pango) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
