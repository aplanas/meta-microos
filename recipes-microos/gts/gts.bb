SUMMARY = "GNU Triangulated Surface Library (GTS)"
DESCRIPTION = "GTS stands for the GNU Triangulated Surface Library. It is an Open \
Source Free Software Library intended to provide a set of useful \
functions to deal with 3D surfaces meshed with interconnected \
triangles. \
 \
A brief summary of its main features: \
 \
  * Simple object-oriented structure giving easy access to topological \
    properties. \
  * 2D dynamic Delaunay and constrained Delaunay triangulations. \
  * Robust geometric predicates (orientation, in circle) using fast \
    adaptive floating point arithmetic (adapted from the fine work of \
    Jonathan R.  Shewchuk). \
  * Robust set operations on surfaces (union, intersection, difference). \
  * Surface refinement and coarsening (multiresolution models). \
  * Dynamic view-independent continuous level-of-detail. \
  * Preliminary support for view-dependent level-of-detail. \
  * Bounding-boxes trees and Kd-trees for efficient point location and \
    collision/intersection detection. \
  * Graph operations: traversal, graph partitioning. \
  * Metric operations (area, volume, curvature ...). \
  * Triangle strips generation for fast rendering."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "gts-0.7.6_p20121130-4.29.aarch64.rpm"
RPM_HASH = "b8ad4f559c52a85a05582f88b4f81a85800a9e7a3062131d21023ba4abb179b1cce57f71b2398f0354fdd8af18c1e70bd90b537056102099d43560798a7117d1"

RPROVIDES:${PN} += "gts gts(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgts-0.7.so.5()(64bit) libgts-0_7-5 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
