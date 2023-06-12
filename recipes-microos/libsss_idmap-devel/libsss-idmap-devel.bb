SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libsss_idmap-devel-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "2f1f55803f75c22d1f37f0f6f580a87edcd84c9789fd23d983bfc5a319642e17ed36c9293b84f73a8d8d4e3f4e11dd4ff62b8e8d0a9a9de166b0fc5618f5c3b7"

RPROVIDES:${PN} += "libsss_idmap-devel \
libsss_idmap-devel(aarch-64) \
pkgconfig(sss_idmap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss_idmap0"

inherit rpm
