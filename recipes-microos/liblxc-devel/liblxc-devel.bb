SUMMARY = "LXC container runtime library development files"
DESCRIPTION = "This package provides the LXC container runtime library development files."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "liblxc-devel-5.0.2-1.1.aarch64.rpm"
RPM_HASH = "ca208744a989e3ed6ce27f90df3be0d2ef309e982fe643d0b080d771e4a5a8b1d67ecc038d01fe746efdf745fe5e1644978c4a44665a45b29f02afde8a91aa9c"

RPROVIDES:${PN} += "liblxc-devel \
liblxc-devel(aarch-64) \
pkgconfig(lxc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxc1 \
pkgconfig(libcap) \
pkgconfig(libseccomp) \
pkgconfig(libselinux)"

inherit rpm
