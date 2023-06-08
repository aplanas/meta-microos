SUMMARY = "Userspace interface for Kernel DRM services for NVIDIA chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for NVIDIA chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_nouveau2-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "468ae6edbe16111d3cc283c4701d2bad5ff4f94a493355946f3597ab4dd0fb3b4ae18e8d1181c07a569dbacc17040b7d5c130800630ad9a32569ccb44fe3b081"

RPROVIDES:${PN} += "libdrm_nouveau.so.2()(64bit) libdrm_nouveau2 libdrm_nouveau2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdrm.so.2()(64bit)"

inherit rpm
