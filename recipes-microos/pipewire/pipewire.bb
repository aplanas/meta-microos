SUMMARY = "A Multimedia Framework designed to be an audio and video server and more"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Capture and playback of audio and video with minimal latency; \
 * Real-time Multimedia processing on audio and video; \
 * Multiprocess architecture to let applications share multimedia content; \
 * GStreamer plugins for easy use and integration in current applications; \
 * Sandboxed applications support."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "858ad68686f1a89317fd77d3b2b997bb5950c8b660462ef472d149834411141da21b820bfc06b0b3c029a341cdb0c9460c5619d714a33df4cf2d1cb14d3f289b"

RPROVIDES:${PN} += "pipewire pipewire(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpipewire-0.3.so.0()(64bit) libpipewire-0_3-0 pipewire-modules-0_3 pipewire-session-manager pipewire-spa-plugins-0_2 pipewire-spa-tools pipewire-tools rtkit"

inherit rpm
