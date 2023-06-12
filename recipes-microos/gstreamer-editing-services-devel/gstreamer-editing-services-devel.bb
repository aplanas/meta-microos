SUMMARY = "GStreamer Editing Services - Development files"
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

PV = "1.22.3"

RPM_NAME = "gstreamer-editing-services-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "c360bb8f93b4b838dcd716f3679b8f0230537f1a9019bc4cdebbee8fec46b005adb73f71b94583e91181fb642312630ccd3fa725ac02c479a7e9ca1c5c2b34d1"

RPROVIDES:${PN} += "gstreamer-editing-services-devel \
gstreamer-editing-services-devel(aarch-64) \
pkgconfig(gst-editing-services-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-editing-services \
libges-1_0-0 \
pkgconfig(gio-2.0) \
pkgconfig(gmodule-no-export-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gstreamer-controller-1.0) \
pkgconfig(gstreamer-pbutils-1.0) \
pkgconfig(gstreamer-validate-1.0) \
pkgconfig(gstreamer-video-1.0) \
pkgconfig(libxml-2.0) \
pkgconfig(python-3.10-embed) \
typelib-1_0-GES-1_0"

inherit rpm
