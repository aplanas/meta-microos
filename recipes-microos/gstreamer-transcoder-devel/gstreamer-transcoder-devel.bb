SUMMARY = "Development files for the GStreamer Transcoding API"
DESCRIPTION = "This subpackage contains the header files needed to build applications \
making use of the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-transcoder-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "07fc96e78c8fde000f507a33ef5bb316a19df4e6fada0428c281781423d4e4878aa8b37bcddb47f70d86d2f7f36f045a2b7a2480450edce2ea067ecb309fbae5"

RPROVIDES:${PN} += "gstreamer-transcoder-devel gstreamer-transcoder-devel(aarch-64) pkgconfig(gstreamer-transcoder-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gstreamer-devel gstreamer-plugins-bad gstreamer-plugins-bad-devel libgsttranscoder-1_0-0 pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-base-1.0) pkgconfig(gstreamer-pbutils-1.0) typelib-1_0-GstTranscoder-1_0"

inherit rpm
