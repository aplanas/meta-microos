SUMMARY = "Development and debugging tools for GStreamer"
DESCRIPTION = "Development and debugging tools for GStreamer \
 \
GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way. \
 \
The easiest way of using GstValidate is to use one of its command-line \
tools, located at tools/ directory. It is also possible to monitor \
GstPipelines from any application by using the LD_PRELOAD gstvalidate \
lib. The third way of using it is to write your own application that \
links and uses libgstvalidate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-devtools-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "df7f402f74c81e65e85cfbd81b89024eec4bbed0b960179ce7b804d65d739cd32d07134c9b3194b8c0fa039ae0c3599aa0ac877b919fb8a042d99c1db59c73b1"

RPROVIDES:${PN} += "application() application(org.freedesktop.GstDebugViewer.desktop) gstreamer-devtools gstreamer-devtools(aarch-64) gstreamer-validate metainfo() metainfo(org.freedesktop.GstDebugViewer.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtspserver-1.0.so.0()(64bit) libgsttranscoder-1.0.so.0()(64bit) libgstvalidate-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) python(abi) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gtk)"

inherit rpm
