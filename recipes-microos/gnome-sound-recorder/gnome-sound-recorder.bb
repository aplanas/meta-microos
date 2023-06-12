SUMMARY = "Sound Recorder"
DESCRIPTION = "A simple, modern sound recorder."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "43.beta"

RPM_NAME = "gnome-sound-recorder-43.beta-1.2.noarch.rpm"
RPM_HASH = "8acf0a8fca9475abf19ee75d2cc4be00d4550a9b0354c6330e135529a6b4531d6aa9125eb03a2f080a58961764a8a3dda18efb61960536bfb1413dd60f221807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.gnome.SoundRecorder.desktop) \
gnome-sound-recorder \
metainfo() \
metainfo(org.gnome.SoundRecorder.metainfo.xml)"
RDEPENDS:${PN} += "gjs \
gstreamer-plugins-base \
gstreamer-plugins-good \
typelib(Adw) \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstPbutils) \
typelib(GstPlayer) \
typelib(Gtk)"

inherit rpm
