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

RPM_NAME = "libOpenCL1-2.3.1-2.1.aarch64.rpm"
RPM_HASH = "2e290d008259d319f83f66914f76a1a0549820fb9d70fc47739cd478e29f5d8fddce9c469997336bffdbb105226bfa263d854b834e6b6da11f5d353f8a5a781d"

RPROVIDES:${PN} += "libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libOpenCL.so.1(OPENCL_1.1)(64bit) libOpenCL.so.1(OPENCL_1.2)(64bit) libOpenCL.so.1(OPENCL_2.0)(64bit) libOpenCL.so.1(OPENCL_2.1)(64bit) libOpenCL.so.1(OPENCL_2.2)(64bit) libOpenCL.so.1(OPENCL_3.0)(64bit) libOpenCL1 libOpenCL1(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) update-alternatives"

inherit rpm
