SUMMARY = "GSequencer core libraries -- Introspection bindings"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This package provides the GObject Introspection bindings for Libags."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "4.5.5"

RPM_NAME = "typelib-1_0-Libags-4_0-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "77e27dd5bebd42b28fd6d4180dda2143615b83f33d790497f9b6b143d3f7980c64ee5ede898439fe9e070f703eaa27e4f94516ec07f0d2e01aec25fdc6598eae"

RPROVIDES:${PN} += "typelib(Ags) typelib(AgsAudio) typelib(AgsGui) typelib-1_0-Libags-4_0 typelib-1_0-Libags-4_0(aarch-64)"
RDEPENDS:${PN} += "libags.so.4()(64bit) libags_audio.so.4()(64bit) libags_gui.so.4()(64bit) libags_server.so.4()(64bit) libags_thread.so.4()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gio) typelib(Graphene) typelib(Gsk) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(Gtk) typelib(HarfBuzz) typelib(Pango) typelib(PangoCairo) typelib(Soup) typelib(cairo) typelib(freetype2) typelib(libxml2)"

inherit rpm
