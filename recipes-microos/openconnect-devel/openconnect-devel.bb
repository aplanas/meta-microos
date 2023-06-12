SUMMARY = "Development files and headers for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN. \
 \
This packages provides development files and headers needed to build \
packages against openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "openconnect-devel-9.12-1.1.aarch64.rpm"
RPM_HASH = "57a2079e742f7a730cca8414e023410c6993b8d845613d9a42bd204dfe8b4b97382d58465ae3cf3bd8fe58ca0ed688d91f8fd04f168bf1040c3fa03d11253151"

RPROVIDES:${PN} += "openconnect-devel \
openconnect-devel(aarch-64) \
pkgconfig(openconnect)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenconnect5 \
pkgconfig(gnutls) \
pkgconfig(liblz4) \
pkgconfig(libpcsclite) \
pkgconfig(libproxy-1.0) \
pkgconfig(libpskc) \
pkgconfig(libxml-2.0) \
pkgconfig(p11-kit-1) \
pkgconfig(stoken) \
pkgconfig(zlib)"

inherit rpm
