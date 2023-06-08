SUMMARY = "A Multimedia Framework designed to be an audio and video server and more"
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
This package provides the PipeWire shared library."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "libpipewire-0_3-0-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "a61b6b99a6c80661f87257b612c76917c9671b32896da4f133501a8ee00d32aa9ce01c9e1b3e703fa32ab51607d14bcc7ed0eff45b70fadef4fcd8a36a4ef5ef"

RPROVIDES:${PN} += "libpipewire-0.3.so.0()(64bit) libpipewire-0_3-0 libpipewire-0_3-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) pipewire-modules-0_3 pipewire-spa-plugins-0_2"

inherit rpm
