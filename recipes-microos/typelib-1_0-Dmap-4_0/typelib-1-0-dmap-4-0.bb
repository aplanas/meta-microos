SUMMARY = "Typelib for libdmapsharing"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.12"

RPM_NAME = "typelib-1_0-Dmap-4_0-3.9.12-1.1.aarch64.rpm"
RPM_HASH = "f56315233d64fb226e68dc44607771c608c0678027bae71fda5a39d6e37d435c116f7d6b542ba4feca69c75630115557adb07657b63a813895f86e1a1df303b9"

RPROVIDES:${PN} += "typelib(Dmap) typelib-1_0-Dmap-4_0 typelib-1_0-Dmap-4_0(aarch-64)"
RDEPENDS:${PN} += "libdmapsharing-4.0.so.3()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Gst) typelib(Soup)"

inherit rpm
