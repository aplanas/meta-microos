SUMMARY = "Development and documentation files for qhull"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. \
 \
This package contains the header files for the Qhull libraries."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhull_r-devel-2020.2-3.5.aarch64.rpm"
RPM_HASH = "ef99d6d1a100fdfe72eb64a24222125a8ae2619c0e646517ec7503542f6d646e9419d5956fb7347de18c4cc1d4b8f93414e36fbe6ac7adcc25e5455138fbbc56"

RPROVIDES:${PN} += "cmake(Qhull) \
pkgconfig(qhull_r) \
qhull-devel \
qhull_r-devel \
qhull_r-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhull_r8_0"

inherit rpm
