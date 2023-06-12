SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-bad-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "0a5e65af9260cffc29fbaff0a682254d98d515ea958370b29e83ca73a2c5436d54242b5bd100eddc5ead95b7ed0562ffcc3b00e83cf37ca6d64158fd2215341d"

RPROVIDES:${PN} += "gstreamer-plugins-bad-devel gstreamer-plugins-bad-devel(aarch-64) pkgconfig(gstreamer-bad-audio-1.0) pkgconfig(gstreamer-codecparsers-1.0) pkgconfig(gstreamer-cuda-1.0) pkgconfig(gstreamer-insertbin-1.0) pkgconfig(gstreamer-mpegts-1.0) pkgconfig(gstreamer-photography-1.0) pkgconfig(gstreamer-play-1.0) pkgconfig(gstreamer-player-1.0) pkgconfig(gstreamer-plugins-bad-1.0) pkgconfig(gstreamer-sctp-1.0) pkgconfig(gstreamer-va-1.0) pkgconfig(gstreamer-vulkan-1.0) pkgconfig(gstreamer-vulkan-wayland-1.0) pkgconfig(gstreamer-vulkan-xcb-1.0) pkgconfig(gstreamer-wayland-1.0) pkgconfig(gstreamer-webrtc-1.0) pkgconfig(gstreamer-webrtc-nice-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gstreamer-plugins-bad gstreamer-plugins-bad-fluidsynth libgstadaptivedemux-1_0-0 libgstbadaudio-1_0-0 libgstbasecamerabinsrc-1_0-0 libgstcodecparsers-1_0-0 libgstcodecs-1_0-0 libgstcuda-1_0-0 libgstinsertbin-1_0-0 libgstisoff-1_0-0 libgstmpegts-1_0-0 libgstphotography-1_0-0 libgstplay-1_0-0 libgstplayer-1_0-0 libgstsctp-1_0-0 libgsttranscoder-1_0-0 libgsturidownloader-1_0-0 libgstva-1_0-0 libgstvulkan-1_0-0 libgstwayland-1_0-0 libgstwebrtc-1_0-0 libgstwebrtcnice-1_0-0 pkgconfig(gmodule-no-export-2.0) pkgconfig(gstreamer-1.0) pkgconfig(gstreamer-allocators-1.0) pkgconfig(gstreamer-audio-1.0) pkgconfig(gstreamer-base-1.0) pkgconfig(gstreamer-gl-prototypes-1.0) pkgconfig(gstreamer-pbutils-1.0) pkgconfig(gstreamer-play-1.0) pkgconfig(gstreamer-sdp-1.0) pkgconfig(gstreamer-tag-1.0) pkgconfig(gstreamer-video-1.0) pkgconfig(gstreamer-vulkan-1.0) pkgconfig(gstreamer-webrtc-1.0) pkgconfig(libdrm) pkgconfig(libva) pkgconfig(libva-drm) pkgconfig(nice) pkgconfig(vulkan) pkgconfig(wayland-client) pkgconfig(wayland-protocols) pkgconfig(xcb) pkgconfig(xkbcommon) pkgconfig(xkbcommon-x11) typelib-1_0-CudaGst-1_0 typelib-1_0-GstBadAudio-1_0 typelib-1_0-GstCodecs-1_0 typelib-1_0-GstCuda-1_0 typelib-1_0-GstInsertBin-1_0 typelib-1_0-GstMpegts-1_0 typelib-1_0-GstPlay-1_0 typelib-1_0-GstPlayer-1_0 typelib-1_0-GstVa-1_0 typelib-1_0-GstWebRTC-1_0"

inherit rpm
