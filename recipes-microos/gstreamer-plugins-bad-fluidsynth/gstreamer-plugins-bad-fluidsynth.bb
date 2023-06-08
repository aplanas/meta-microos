SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "a90cef5639caf28caaf9709bd5a292d8d8bb3524900f444a4952eced364ffb2942012636cce7d4c99134e5725fb78ad232e5245dd92b7de6ab9a5492f33b3e5a"

RPROVIDES:${PN} += "gstreamer-plugins-bad-fluidsynth gstreamer-plugins-bad-fluidsynth(aarch-64) gstreamer1(decoder-audio/x-midi-event)()(64bit) gstreamer1(element-fluiddec)()(64bit) libgstfluidsynthmidi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfluidsynth.so.3()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
