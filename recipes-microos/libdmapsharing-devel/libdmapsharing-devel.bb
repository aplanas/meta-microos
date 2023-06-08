SUMMARY = "Library implementing the DMAP family of protocols - Development Files"
DESCRIPTION = "Libdmapsharing is a library you may use to access, share and control the \
playback of media content using DMAP (DAAP, DPAP & DACP). Libdmapsharing \
also detects audio AirPlay services; coupled with the AirPlay support \
in PulseAudio or GStreamer, this can allow an application to stream audio \
to an AirPlay device. The DMAP family of protocols are used by products \
such as Apple iTunes, Apple iPhoto, and the Roku SoundBridge family to \
share media such as music and photos. \
 \
This package contains development files for libdmapsharing."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.11"

RPM_NAME = "libdmapsharing-devel-3.9.11-1.1.aarch64.rpm"
RPM_HASH = "ceb81d492b94039527129e78fba7b6e2703ec49e00326b1e16408f81b53592feb2702d1a09702b754407218ff8c8874d6411c64d926f5fc6614b26d76908051a"

RPROVIDES:${PN} += "libdmapsharing-devel libdmapsharing-devel(aarch-64) pkgconfig(libdmapsharing-4.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdmapsharing-4_0-3 pkgconfig(glib-2.0) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-app-1.0) pkgconfig(libsoup-3.0) typelib-1_0-Dmap-4_0"

inherit rpm
