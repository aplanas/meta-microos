SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libacars-devel-1.3.1-1.16.aarch64.rpm"
RPM_HASH = "6089b994c1e0440c5fb2d113bf09c8afd1a0bd0bdfd0231bb169c79c300f0033cbb54943d89db78b3966f3f93a942bc78bf3f957e8154cfcc55e129ddaa0a0d7"

RPROVIDES:${PN} += "libacars-devel \
libacars-devel(aarch-64) \
pkgconfig(libacars)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacars1"

inherit rpm
