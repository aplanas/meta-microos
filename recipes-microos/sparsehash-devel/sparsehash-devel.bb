SUMMARY = "Memory-efficient C++ hash_map implementation"
DESCRIPTION = "The Google SparseHash project contains several C++ template hash-map \
implementations with different performance characteristics, including \
an implementation that optimizes for space and one that optimizes for \
speed."
LICENSE = "BSD-3-Clause"

PV = "2.0.4"

RPM_NAME = "sparsehash-devel-2.0.4-1.9.aarch64.rpm"
RPM_HASH = "c6be869c1050ff36f8d14db934b8c7979162ac62b43e74145b10aa4c295b886f42114aeef0b6ac45b9a349e52fafae491b068d0a5d19f7c37f19b21defc5a810"

RPROVIDES:${PN} += "pkgconfig(libsparsehash) sparsehash-devel sparsehash-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
