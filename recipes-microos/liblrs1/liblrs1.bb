SUMMARY = "Reverse Search Vertex Enumeration library"
DESCRIPTION = "lrslib is a library for the reverse search algorithm for vertex \
enumeration/convex hull problems and comes with a choice of three \
arithmetic packages. Input file formats are compatible with the \
cddlib package. Computations are done in multiprecision \
arithmetic."
LICENSE = "GPL-2.0-or-later"

PV = "7.2"

RPM_NAME = "liblrs1-7.2-1.3.aarch64.rpm"
RPM_HASH = "4a21b3a19502f95f771485894631cc678d65bd68329c4ebb30aa06138636051ca944941b682c105347f760da82e53a73301addb1702ea3562a521aee40c694ae"

RPROVIDES:${PN} += "liblrs.so.1()(64bit) \
liblrs1 \
liblrs1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit)"

inherit rpm
