SUMMARY = "Development files for spglib/libsymspg"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "spglib-devel-2.0.2-1.3.aarch64.rpm"
RPM_HASH = "f9eb5c55c3b8a940de8a9c3dda9f60eddf0a255d7e16286994cbee190c8e13aa9dd4242319dcb7124e73711b66792a83a270b11ed09af0347eeb61f09f65a104"

RPROVIDES:${PN} += "pkgconfig(spglib) spglib-devel spglib-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsymspg1"

inherit rpm
