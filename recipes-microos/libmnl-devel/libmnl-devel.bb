SUMMARY = "Development files for libmnl"
DESCRIPTION = "libmnl is a minimalistic user-space library oriented to Netlink \
developers. There are a lot of common tasks in parsing, validating, \
constructing of both the Netlink header and TLVs that are repetitive \
and easy to get wrong. This library aims to provide simple helpers \
that allows you to re-use code and to avoid re-inventing the wheel."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libmnl-devel-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "1578f975214c49d5370c5cf0387f31b2c8da0bcb938003ac69a51eb4306da1291ec8b32c12ad591cc84b5ce2ad07199b6b57de4da3c92714ff501f133ba27629"

RPROVIDES:${PN} += "libmnl-devel \
libmnl-devel(aarch-64) \
pkgconfig(libmnl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmnl0"

inherit rpm
