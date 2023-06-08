SUMMARY = "OpenCL ICD Bindings"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides an Installable Client Driver Bindings (ICD Bindings). \
The provided libOpenCL library is able to load any free or non-free installed \
ICD (driver backend)."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libOpenCL1-2.3.1-1.10.aarch64.rpm"
RPM_HASH = "80eec16318059ab37ad42c4f417ee765afdcc0b50293bdc5ad8d0b229c069ff880f03d9c7a6dd01efc1fb58bf522f8f9ff0a9b2876b134fd9e61202edd8902e3"

RPROVIDES:${PN} += "libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libOpenCL.so.1(OPENCL_1.1)(64bit) libOpenCL.so.1(OPENCL_1.2)(64bit) libOpenCL.so.1(OPENCL_2.0)(64bit) libOpenCL.so.1(OPENCL_2.1)(64bit) libOpenCL.so.1(OPENCL_2.2)(64bit) libOpenCL.so.1(OPENCL_3.0)(64bit) libOpenCL1 libOpenCL1(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) update-alternatives"

inherit rpm
