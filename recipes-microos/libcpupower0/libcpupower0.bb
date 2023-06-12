SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "libcpupower0-6.3.4-4.12.aarch64.rpm"
RPM_HASH = "db97ad191e5e3bc4778d9305a5d92f9278a22eb7104076605e33f4a1ec8444894c3ac0aaa3e82dda7e09d12e71765a9c024bef2c19e1195e2a75e96bac40ba10"

RPROVIDES:${PN} += "libcpupower.so.0()(64bit) libcpupower0 libcpupower0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
