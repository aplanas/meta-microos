SUMMARY = "Development files and headers for openconnect"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, including Cisco's 'AnyConnect' VPN. \
 \
This packages provides development files and headers needed to build \
packages against openconnect."
LICENSE = "LGPL-2.1-or-later"

PV = "9.10"

RPM_NAME = "openconnect-devel-9.10-1.1.aarch64.rpm"
RPM_HASH = "e24107e89b050aaedd22e40dd106cbd2e4700b6a0364c8df368122c5cc863ebf1f58c7e278cea4fbefbb6a54e49f91a30f8e307371bfb2628e16cc48f1d2ba49"

RPROVIDES:${PN} += "openconnect-devel openconnect-devel(aarch-64) pkgconfig(openconnect)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenconnect5 pkgconfig(gnutls) pkgconfig(liblz4) pkgconfig(libpcsclite) pkgconfig(libproxy-1.0) pkgconfig(libpskc) pkgconfig(libxml-2.0) pkgconfig(p11-kit-1) pkgconfig(stoken) pkgconfig(zlib)"

inherit rpm
