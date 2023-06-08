SUMMARY = "GStreamer Editing Services"
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
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-editing-services-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "df870c3c128858ae2300bb50f8e94c9d4ce81374e7af08e196eb78deebc6cbacb51a33a218cc974276acdcf932e2fa669899ad6c052683905e14d9c0dacdef2c"

RPROVIDES:${PN} += "gstreamer-editing-services gstreamer-editing-services(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libges-1.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvalidate-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) python(abi) typelib(GObject) typelib(Gst)"

inherit rpm
