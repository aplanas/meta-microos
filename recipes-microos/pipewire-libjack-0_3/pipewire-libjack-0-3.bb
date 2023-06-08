SUMMARY = "PipeWire libjack replacement libraries"
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
This package provides the PipeWire replacement libraries for libjack."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-libjack-0_3-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "d16f6df490891e01789f8aae0f7ff5e09efc3f24f7b9f161a2438a44c85d5f945c69cf90aa4220827fa3882583a6b787b40f264c2f8ba49309b949e991680be4"

RPROVIDES:${PN} += "config(pipewire-libjack-0_3) libjack.so.0()(64bit) libjacknet.so.0()(64bit) libjackserver.so.0()(64bit) pipewire-libjack-0_3 pipewire-libjack-0_3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpipewire-0.3.so.0()(64bit) update-alternatives"

inherit rpm
