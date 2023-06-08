SUMMARY = "GStreamer Editing Services - Libraries"
DESCRIPTION = "The GStreamer multimedia framework and the accompanying GNonLin set \
of plugins for non-linear editing offer all the building blocks \
for: \
Decoding and encoding to a wide variety of formats, through all the \
available GStreamer plugins. \
Easily choosing segments of streams and arranging them through time \
through the GNonLin set of plugins. \
 \
But all those building blocks only offer stream-level access, which \
results in developers who want to write non-linear editors to write \
a consequent amount of code to get to the level of non-linear \
editing notions which are closer and more meaningful for the \
end-user (and therefore the application). \
 \
The GStreamer Editing Services (hereafter GES) aims to fill the gap \
between GStreamer/GNonLin and the application developer by offering \
a series of classes to simplify the creation of many kind of \
editing-related applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GES-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "9e061a9530d7d080e488a16f235b7f9708209c27095e94f3d1266a9914316aed3a1889f389ad49a1895be4d9816bfb4929c288acec848c5ef3113fcfe4b33e4f"

RPROVIDES:${PN} += "typelib(GES) typelib-1_0-GES-1_0 typelib-1_0-GES-1_0(aarch-64)"
RDEPENDS:${PN} += "libges-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstVideo)"

inherit rpm
