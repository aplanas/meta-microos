SUMMARY = "Libraries and headers for libnl"
DESCRIPTION = "The libnl suite is a collection of libraries providing APIs to \
Netlink protocol based Linux kernel interfaces."
LICENSE = "LGPL-2.1-only"

PV = "3.7.0"

RPM_NAME = "libnl3-devel-3.7.0-1.4.aarch64.rpm"
RPM_HASH = "41e1516e738f4cfc6d77624e5869da5355a10dcd6dc5e251c43c042d6565c31bc143ede1f5f3b1abd7848d3c91b68432276f2a5f61dc63565b4acda942db071a"

RPROVIDES:${PN} += "libnl-devel \
libnl3-devel \
libnl3-devel(aarch-64) \
pkgconfig(libnl-3.0) \
pkgconfig(libnl-cli-3.0) \
pkgconfig(libnl-genl-3.0) \
pkgconfig(libnl-idiag-3.0) \
pkgconfig(libnl-nf-3.0) \
pkgconfig(libnl-route-3.0) \
pkgconfig(libnl-xfrm-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnl3-200 \
pkgconfig(libnl-3.0) \
pkgconfig(libnl-genl-3.0) \
pkgconfig(libnl-nf-3.0) \
pkgconfig(libnl-route-3.0)"

inherit rpm
