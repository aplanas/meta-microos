SUMMARY = "cpuset processor and memory placement library"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
enables a system administrator to confine tasks to running certain \
CPUs, and to allocating memory on certain Memory Nodes.  The libcpuset \
library provides a convenient 'C' API to cpusets."
LICENSE = "LGPL-2.1+"

PV = "1.0"

RPM_NAME = "libcpuset1-1.0-36.25.aarch64.rpm"
RPM_HASH = "136160ef6376b2388f5e3912a9f58d134e993cbb6825875b8daf43e50107ebb8cb4b28a7306bc380c3bb38e354d7d861d1e712bb1197671ae75ac77f5c6b6a0d"

RPROVIDES:${PN} += "libcpuset.so.1()(64bit) libcpuset1 libcpuset1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbitmask.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
