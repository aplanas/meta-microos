SUMMARY = "Development files for the GStreamer Transcoding API"
DESCRIPTION = "This subpackage contains the header files needed to build applications \
making use of the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-transcoder-devel-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "5ba78978d63ddcfe6c8b69600ef36daecd9d73961edcad3c2098cfc0edb560d8c291f47f450447e480144a1e69dbedd20754a66f7957a27056818cf362ba3970"

RPROVIDES:${PN} += "gstreamer-transcoder-devel gstreamer-transcoder-devel(aarch-64) pkgconfig(gstreamer-transcoder-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gstreamer-devel gstreamer-plugins-bad gstreamer-plugins-bad-devel libgsttranscoder-1_0-0 pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-base-1.0) pkgconfig(gstreamer-pbutils-1.0) typelib-1_0-GstTranscoder-1_0"

inherit rpm
