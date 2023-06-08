SUMMARY = "Development files of ocl-icd"
DESCRIPTION = "This package provides the files needed to build OpenCL client drivers that \
use ocl-icd for ICD functionality."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "ocl-icd-devel-2.3.1-1.10.aarch64.rpm"
RPM_HASH = "014a9a55bf59a648034d549b32f72180026e4fb2b4272f729d29223560ec0fa20da4029bdd079b45ad450b1b87f40c44c05bc34efe28166bbef1e77d1110fef0"

RPROVIDES:${PN} += "ocl-icd-devel ocl-icd-devel(aarch-64) pkgconfig(OpenCL) pkgconfig(ocl-icd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libOpenCL1 opencl-headers pkgconfig(egl)"

inherit rpm
