SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing newplug-ins. \
 \
This package contains well-written plug-ins that can't be shipped in \
gstreamer-plugins-good because: \
- the license is not LGPL \
- the license of the library is not LGPL \
- there are possible licensing issues with the code."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-ugly-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "f6564e364cb8cce1603228d4b6b40946dcba936dfbe75a6986f5ede5f431efa8eeef9a05198fe0d249e6c03037388563ddb69b1b42565382299f1d1b03c7c22f"

RPROVIDES:${PN} += "gst-plugins-ugly \
gstreamer-plugins-ugly \
gstreamer-plugins-ugly(aarch-64) \
gstreamer1(decoder-application/vnd.rn-realmedia)()(64bit) \
gstreamer1(decoder-application/x-pn-realaudio)()(64bit) \
gstreamer1(decoder-application/x-rdt)()(64bit) \
gstreamer1(decoder-audio/AMR)()(64bit) \
gstreamer1(decoder-audio/AMR-WB)()(64bit) \
gstreamer1(decoder-audio/ac3)()(64bit) \
gstreamer1(decoder-audio/x-ac3)()(64bit) \
gstreamer1(decoder-audio/x-lpcm)()(64bit) \
gstreamer1(decoder-audio/x-private-ts-lpcm)()(64bit) \
gstreamer1(decoder-audio/x-private1-ac3)()(64bit) \
gstreamer1(decoder-audio/x-private1-lpcm)()(64bit) \
gstreamer1(decoder-audio/x-private2-lpcm)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=1)(systemstream=false)()(64bit) \
gstreamer1(decoder-video/mpeg)(mpegversion=2)(systemstream=false)()(64bit) \
gstreamer1(element-a52dec)()(64bit) \
gstreamer1(element-amrnbdec)()(64bit) \
gstreamer1(element-amrnbenc)()(64bit) \
gstreamer1(element-amrwbdec)()(64bit) \
gstreamer1(element-cdiocddasrc)()(64bit) \
gstreamer1(element-dvdlpcmdec)()(64bit) \
gstreamer1(element-dvdreadsrc)()(64bit) \
gstreamer1(element-dvdsubdec)()(64bit) \
gstreamer1(element-dvdsubparse)()(64bit) \
gstreamer1(element-mpeg2dec)()(64bit) \
gstreamer1(element-pnmsrc)()(64bit) \
gstreamer1(element-rademux)()(64bit) \
gstreamer1(element-rdtdepay)()(64bit) \
gstreamer1(element-rdtmanager)()(64bit) \
gstreamer1(element-rmdemux)()(64bit) \
gstreamer1(element-rtspreal)()(64bit) \
gstreamer1(encoder-audio/AMR)()(64bit) \
gstreamer1(urisource-cdda)()(64bit) \
gstreamer1(urisource-dvd)()(64bit) \
gstreamer1(urisource-pnm)()(64bit) \
libgsta52dec.so()(64bit) \
libgstamrnb.so()(64bit) \
libgstamrwbdec.so()(64bit) \
libgstcdio.so()(64bit) \
libgstdvdlpcmdec.so()(64bit) \
libgstdvdread.so()(64bit) \
libgstdvdsub.so()(64bit) \
libgstmpeg2dec.so()(64bit) \
libgstrealmedia.so()(64bit) \
patched_subset"
RDEPENDS:${PN} += "gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liba52.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libdvdread.so.8()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstrtsp-1.0.so.0()(64bit) \
libgstsdp-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libmpeg2.so.0()(64bit) \
libopencore-amrnb.so.0()(64bit) \
libopencore-amrwb.so.0()(64bit) \
liborc-0.4.so.0()(64bit)"

inherit rpm
