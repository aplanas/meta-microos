SUMMARY = "Video editing software"
DESCRIPTION = "Pitivi is a non-linear, featureful movie editor. \
It supports realtime trimming previews, ripple and roll editing, \
grouping and snapping, realtime assets management and searching, \
playhead-centric zooming and editing, non-modal cutting, detachable \
interface components, smooth scrolling, and automatic zoom \
adjustment."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.03"

RPM_NAME = "pitivi-2023.03-1.1.aarch64.rpm"
RPM_HASH = "cacf1b0ccede3bf2f4c87b6366f993cf2026f72a5757746a61dfac253455354c15048b2e658634937fc601035c0f974bfcc2f229a4db4b1033710b61262effb5"

RPROVIDES:${PN} += "application() application(org.pitivi.Pitivi.desktop) metainfo() metainfo(org.pitivi.Pitivi.appdata.xml) mimehandler(text/x-xges) mimehandler(text/x-xptv) pitivi pitivi(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 gstreamer-transcoder ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpython3.10.so.1.0()(64bit) python3-cairo python3-gobject python3-gst python3-librosa python3-matplotlib-gtk3 python3-numpy python3-opencv typelib(GES) typelib(GLib) typelib(GObject) typelib(GSound) typelib(Gdk) typelib(GdkPixbuf) typelib(GdkX11) typelib(Gio) typelib(Gst) typelib(GstController) typelib(GstPbutils) typelib(GstTranscoder) typelib(GstValidate) typelib(GstVideo) typelib(Gtk) typelib(Notify) typelib(Pango) typelib(PangoCairo) typelib(Peas) typelib(Wnck) typelib-1_0-GES-1_0 typelib-1_0-Gst-1_0"

inherit rpm
