SUMMARY = "The Portable Universal Plug and Play (UPnP) SDK"
DESCRIPTION = "The Portable Universal Plug and Play (UPnP) SDK provides support for building \
UPnP-compliant control points, devices, and bridges on several operating \
systems."
LICENSE = "BSD-3-Clause"

PV = "1.14.17"

RPM_NAME = "libupnp-devel-1.14.17-1.1.aarch64.rpm"
RPM_HASH = "7e8f33d38190fc9d92e9614815ae353202262545109f99d44646f8b0c04313c49d2068ecaa43bea8690f84e4b3ee864bd814abf04a43d109ea4ea2d931e33764"

RPROVIDES:${PN} += "libixml-devel \
libupnp-devel \
libupnp-devel(aarch-64) \
pkgconfig(libupnp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixml11 \
libupnp17"

inherit rpm
