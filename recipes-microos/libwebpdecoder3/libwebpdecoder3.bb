SUMMARY = "Library for decoding WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebpdecoder3-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "5fc07b32947ec1386b2b7c6fdc0c6d700b4b866aec977d826b18cc28746a3ece365530a84499bf54bc11af0ab0ba261d9f42560865544ba132cdb68d11029886"

RPROVIDES:${PN} += "libwebpdecoder.so.3()(64bit) libwebpdecoder3 libwebpdecoder3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
