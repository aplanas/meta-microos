SUMMARY = "Headers and link library for libzrtpcpp"
DESCRIPTION = "This package provides the header files for building applications that \
use libzrtpcpp."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp-devel-4.7.0-1.11.aarch64.rpm"
RPM_HASH = "0b1ce6320bbdba9f21da6eef062ca276e4a46d73ec3607562006b8f0f452a653304d9a3c3fc2aed992c0356b402d365be5405866ac8ca7fd6e33bbccf79f6d83"

RPROVIDES:${PN} += "libzrtpcpp-devel \
libzrtpcpp-devel(aarch-64) \
pkgconfig(libzrtpcpp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ccrtp-devel \
libzrtpcpp4 \
pkgconfig(libcrypto)"

inherit rpm
