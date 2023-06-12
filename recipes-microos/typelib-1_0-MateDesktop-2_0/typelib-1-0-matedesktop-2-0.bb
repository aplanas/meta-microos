SUMMARY = "Common API for various MATE modules typelib"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-MateDesktop-2_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "9e34329e446cdf3e5c4cbf5d2dc9343078aeec4ce48518038d387a5ae5b08c7036b99a933f5fc37d19fa4bf6dc7b1d0ffc883f287ecbb01120329b90eab39232"

RPROVIDES:${PN} += "typelib(MateDesktop) \
typelib-1_0-MateDesktop-2_0 \
typelib-1_0-MateDesktop-2_0(aarch-64)"
RDEPENDS:${PN} += "libmate-desktop-2.so.17()(64bit) \
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
