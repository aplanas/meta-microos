SUMMARY = "Develoment files for VTK Java bindings"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This provides the Java part of the development files."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "vtk-openmpi4-java-devel-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "2553866053e9f3c0933c8d45fc4ae14c3cfb5d41f63e22609bf97018842fd9ed3a54d4911c1d692bc57bab68273342473f817ae0f52aa10dce1ae7ea88613ff3"

RPROVIDES:${PN} += "vtk-openmpi4-devel:/usr/lib64/mpi/gcc/openmpi4/lib64//libvtkJava.so vtk-openmpi4-java-devel vtk-openmpi4-java-devel(aarch-64)"
RDEPENDS:${PN} += "java-devel vtk-openmpi4-devel vtk-openmpi4-java"

inherit rpm
