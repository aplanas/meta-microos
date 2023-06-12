SUMMARY = "Portable Computing Language - an OpenCL implementation"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
pocl uses Clang as an OpenCL C frontend and LLVM for the kernel compiler \
implementation, and as a portability layer. If your desired target has an LLVM \
backend, it should be possible to get OpenCL support by using pocl. \
 \
pocl yields improved performance portability by using a kernel compiler that \
can generate multi-work-item work-group functions that exploit various types of \
parallel hardware resources, such as VLIW, superscalar, SIMD, SIMT, multicore \
and multithread."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "pocl-3.1-3.1.aarch64.rpm"
RPM_HASH = "9d54c7b4717155fa09a6c5191378e257642c40e6c6814b55fe267e0a8d7df433664c03a42ed252f90d535d5f4278a197eecbbd24b687442bb2d13ffb921ab5a0"

RPROVIDES:${PN} += "libpocl-devices-basic.so()(64bit) libpocl-devices-pthread.so()(64bit) pocl pocl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpocl.so.2()(64bit)"

inherit rpm
