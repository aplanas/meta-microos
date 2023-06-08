SUMMARY = "Perl interface to the GStreamer library"
DESCRIPTION = "This package provides perl bindings for GStreamer 1.x. \
GStreamer is a library for constructing graphs of media-handling \
components. The applications it supports range from simple \
OGG Vorbis playback, audio/video streaming to complex audio \
(mixing) and video (non-linear editing) processing."
LICENSE = "BSD-2-Clause"

PV = "0.003"

RPM_NAME = "perl-GStreamer1-0.003-1.29.aarch64.rpm"
RPM_HASH = "52d056e875c97c75dc2b288968cf2d5b21e01e8c28dbd96af5b4955c8efb586f32e3d99c076c11c842947353f6625b7b778d93a7f33b1cb6aa3c88417a740d06"

RPROVIDES:${PN} += "perl(GStreamer1) perl(GStreamer1::Caps::Simple) perl-GStreamer1 perl-GStreamer1(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Glib::Object::Introspection) typelib-1_0-Gst-1_0 typelib-1_0-GstApp-1_0"

inherit rpm
