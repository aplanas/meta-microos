SUMMARY = "Development files for libfakekey"
DESCRIPTION = "The libfakekey-devel package contains libraries and header files for \
developing applications that use libfakekey."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3"

RPM_NAME = "libfakekey-devel-0.3-1.4.aarch64.rpm"
RPM_HASH = "70b268298e5b8be11060b470265acef89526e9884001cb6823c7738a229f0bb9360f036ef4aa05ddc0a23c66842681f20b27d5d2ad79da1fda21bc8e52552a5e"

RPROVIDES:${PN} += "libfakekey-devel libfakekey-devel(aarch-64) pkgconfig(libfakekey)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfakekey0"

inherit rpm
