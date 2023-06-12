SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "9d42f21221ba40904629c4f6e6a65e19006c5dac77ea6568f39ecda35173ceb77792d61e07d158ffe26fe3e766255f13fcad73126d0e591667102b3c3fd82d53"

RPROVIDES:${PN} += "gstreamer-plugins-bad-fluidsynth gstreamer-plugins-bad-fluidsynth(aarch-64) gstreamer1(decoder-audio/x-midi-event)()(64bit) gstreamer1(element-fluiddec)()(64bit) libgstfluidsynthmidi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfluidsynth.so.3()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
