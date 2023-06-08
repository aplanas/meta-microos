SUMMARY = "GObject introspection bindings for the GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstValidate-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "c5a7cafc524f2163b474c287a4b05c5fdbdaf1f18313e0c8cb076827913d392439efe452c01d29c9b15101251114d13980ca72e219b659fe204b0d8c711247ba"

RPROVIDES:${PN} += "typelib(GstValidate) typelib-1_0-GstValidate-1_0 typelib-1_0-GstValidate-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvalidate-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm
