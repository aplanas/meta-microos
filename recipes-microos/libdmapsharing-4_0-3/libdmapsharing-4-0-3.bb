SUMMARY = "Library implementing the Digital Media Access Protocol family"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.12"

RPM_NAME = "libdmapsharing-4_0-3-3.9.12-1.1.aarch64.rpm"
RPM_HASH = "734fd0adffdbc805763da36c15c36339f2953638658fe983ecfcd345b99ef6e8532cf399fbb58719c5a7a74fc2adb1b069158c2b0aa3aa044e6c94c9b8939c26"

RPROVIDES:${PN} += "libdmapsharing-4.0.so.3()(64bit) libdmapsharing-4_0-3 libdmapsharing-4_0-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libavahi-glib.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libsoup-3.0.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
