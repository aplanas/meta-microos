SUMMARY = "Libraries SFCGAL applications"
DESCRIPTION = "This library  support ISO 19107:2013, OGC Simple Features Access 1.2 for 3D operations. \
It provides standard compliant geometry types and operations, that can \
be accessed from its C or C++ APIs. PostGIS uses the C API, to expose some \
SFCGAL's functions in spatial databases (cf. PostGIS manual). \
 \
Geometry coordinates have an exact rational number representation and can \
be either 2D or 3D. Among supported geometry types are : \
 \
 Points \
 LineStrings \
 Polygons \
 TriangulatedSurfaces \
 PolyhedralSurfaces \
 GeometryCollections \
 Solids \
 \
Supported operations include : \
 \
 WKT reading and writing with exact rational number representation for coordinates \
 Intersection operations and predicates \
 Convex hull computation \
 Tessellation \
 Extrusion \
 Area and distance computation \
 Minkovski sums \
 Contour offsets \
 Straight skeleton generations"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libSFCGAL1-1.4.1-4.4.aarch64.rpm"
RPM_HASH = "3c8151984948d49aacdca3d8303eb67b9e988f852dbc3742e48c48b37fc5a4f280ccce187c7ec9a387d5ce71a3a7fb51cdca73b5d92503761d32c76a73505238"

RPROVIDES:${PN} += "libSFCGAL.so.1()(64bit) \
libSFCGAL1 \
libSFCGAL1(aarch-64) \
libsfcgal1"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
