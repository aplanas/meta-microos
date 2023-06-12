SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension."
LICENSE = "GPL-3.0-or-later"

PV = "5.22.5"

RPM_NAME = "polylib-5.22.5-1.11.aarch64.rpm"
RPM_HASH = "6770462919a24b1ffb3147b33fb93071a24084acdc845ddde2d20871a6468ca9874d24418ae0895ddb504a8f574b69cd4f34a7dffa377f62c82e74404698f104"

RPROVIDES:${PN} += "polylib \
polylib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libpolylibgmp.so.8()(64bit)"

inherit rpm
