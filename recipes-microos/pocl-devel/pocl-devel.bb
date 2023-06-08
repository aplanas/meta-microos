SUMMARY = "Development files for the Portable Computing Language"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage provides the development files needed for pocl."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "pocl-devel-3.1-2.3.aarch64.rpm"
RPM_HASH = "a0a2b0db6885a9df2d259133a7300d6cb4a6e82fb13fc86ff0e953ab632522bad8d0c74bf00d558a12b28ddd03d6db84876e867d4f71b736070e862fac8b794c"

RPROVIDES:${PN} += "pkgconfig(pocl) pocl-devel pocl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpocl2 opencl-headers pocl"

inherit rpm
