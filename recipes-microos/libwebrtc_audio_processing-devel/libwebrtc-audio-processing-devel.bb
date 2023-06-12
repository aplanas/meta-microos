SUMMARY = "Real-Time Communication Library for Web Browsers"
DESCRIPTION = "WebRTC is an open source project that enables web browsers with Real-Time \
Communications (RTC) capabilities via simple Javascript APIs. The WebRTC \
components have been optimized to best serve this purpose. \
 \
WebRTC implements the W3C's proposal for video conferencing on the web."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "libwebrtc_audio_processing-devel-0.3.1-1.12.aarch64.rpm"
RPM_HASH = "f24c1df599296fdca7648797f42c2f1e4938474548b87ece7db330c05eeb928697f948f3a07cf8019e58ba6f90e059f0bacee24288feb4661f88cb22c5865c3f"

RPROVIDES:${PN} += "libwebrtc_audio_processing-devel \
libwebrtc_audio_processing-devel(aarch-64) \
pkgconfig(webrtc-audio-processing)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwebrtc_audio_processing1"

inherit rpm
