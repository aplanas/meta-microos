SUMMARY = "Development files for pipewire-libjack-0_3"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Capture and playback of audio and video with minimal latency; \
 * Real-time Multimedia processing on audio and video; \
 * Multiprocess architecture to let applications share multimedia content; \
 * GStreamer plugins for easy use and integration in current applications; \
 * Sandboxed applications support. \
 \
This package provides the PipeWire replacement development files \
for libjack."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "b25e1567bd5e2f9db8e092bb7b1bbcf602dc5f96778bbea118f1918874324b65d7d8e2de2dd5bcf29b09601a9d45fd06cf18369e0ce53d9fe0bf10fcb51aed25"

RPROVIDES:${PN} += "pipewire-libjack-0_3-devel pipewire-libjack-0_3-devel(aarch-64) pkgconfig(jack)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pipewire-libjack-0_3"

inherit rpm
