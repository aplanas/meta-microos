SUMMARY = "Introspection bindings for the GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the introspection bindings for the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstTranscoder-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "e606e4949ffbd126c098b011b0170edd8b9a4e894def79b5a8ac6454eef7bab7d8c360685be021aa94c66cdcf44676f36bdcbddba8e345757e0c72aac881c5d4"

RPROVIDES:${PN} += "typelib(GstTranscoder) typelib-1_0-GstTranscoder-1_0 typelib-1_0-GstTranscoder-1_0(aarch-64)"
RDEPENDS:${PN} += "libgsttranscoder-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm
