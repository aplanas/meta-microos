SUMMARY = "A quick previewer for Nemo file manager"
DESCRIPTION = "This is NemoPreview, a quick previewer for Nemo, the Cinnamon \
desktop file manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-preview-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "ef0fe5242669ac9629787ae611ef8c750b54acafa1d7285746d8b68b65307597dec39ed8e7c3f74aa24ac387cdf42cfc437b30f533ba9e42f49f80ed3c8a268e"

RPROVIDES:${PN} += "libnemo-preview-1.0.so()(64bit) nemo-extension-preview nemo-extension-preview(aarch-64) nemo-extension-preview-devel nemo-preview typelib(NemoPreview)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcjs.so.0()(64bit) libclutter-1.0.so.0()(64bit) libclutter-gst-3.0.so.0()(64bit) libclutter-gtk-1.0.so.0()(64bit) libfreetype.so.6()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libgirepository-1.0.so.1()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libmusicbrainz5.so.1()(64bit) libpango-1.0.so.0()(64bit) libxreaderdocument.so.3()(64bit) libxreaderview.so.3()(64bit) nemo typelib(Atk) typelib(Clutter) typelib(ClutterGst) typelib(Cogl) typelib(CoglPango) typelib(GL) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(GdkX11) typelib(Gio) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstTag) typelib(GstVideo) typelib(Gtk) typelib(GtkClutter) typelib(GtkSource) typelib(HarfBuzz) typelib(Json) typelib(NemoPreview) typelib(Pango) typelib(PangoCairo) typelib(WebKit2) typelib(XreaderDocument) typelib(XreaderView) typelib(cairo) typelib(freetype2) typelib(xlib)"

inherit rpm
