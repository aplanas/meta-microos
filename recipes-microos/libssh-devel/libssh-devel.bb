SUMMARY = "SSH library development headers"
DESCRIPTION = "Development headers for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh-devel-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "58dace1717b8e88221751f4b9a8ed0851b8dd1dfed5f89dda76647ad4a5802fd274f24b54920005e78d977602dee5b9ea6a926cb5e2fcf8ad0ea8ca029d6cc9b"

RPROVIDES:${PN} += "cmake(libssh) libssh-devel libssh-devel(aarch-64) pkgconfig(libssh)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake libssh4"

inherit rpm
