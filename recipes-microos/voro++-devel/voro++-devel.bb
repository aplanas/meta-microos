SUMMARY = "Development headers and libraries for voro++"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles. \
 \
This package contains development headers and libraries for voro++."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "voro++-devel-0.4.6-1.24.aarch64.rpm"
RPM_HASH = "30ec2528acc60bfd653b298cfb53c769e2b17640c4a483a7501da4ff079466501657b63e199bd2b8f079b191056dbdd6004841b173d4fc98a36a187c79fbf3b3"

RPROVIDES:${PN} += "voro++-devel voro++-devel(aarch-64)"
RDEPENDS:${PN} += "libvoro++0"

inherit rpm
