SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "libcpupower0-6.3.1-4.10.aarch64.rpm"
RPM_HASH = "9a292e5bedfe086f049aa5d8b0b6620758e4f85c8ead9283dcdc52a449b6509c2776acd23847da3918c96bd35d0a7e109f153abf8d729d98e71248b401b5dc7f"

RPROVIDES:${PN} += "libcpupower.so.0()(64bit) libcpupower0 libcpupower0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
