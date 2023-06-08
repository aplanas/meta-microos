SUMMARY = "Development files for Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libpolys-devel-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "c75d5dd7be36fafcf2e43595f678a57fdb351a8ac4bec38e715585b6d5008d24c590a1d9d0fc775b5ee7dff49c146c44c584a3b9a1fc72a497485dda3cabe650"

RPROVIDES:${PN} += "libpolys-devel libpolys-devel(aarch-64) pkgconfig(libpolys)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSingular-devel libpolys-4_3_1 pkgconfig(factory) pkgconfig(omalloc) pkgconfig(singular_resources)"

inherit rpm
