SUMMARY = "SBLIM Common Resource Access Library for WBEM-SMT tasks"
DESCRIPTION = "The tools-libra package provides common functionality required by \
the task-specific resource access layers of wbem-smt tasks such as \
cmpi-dns and cmpi-samba."
LICENSE = "EPL-1.0"

PV = "1.0"

RPM_NAME = "libRaTools0-1.0-20.10.aarch64.rpm"
RPM_HASH = "cdd7df9060e75ea31b1486645951e2b6621a84d8f621cab4d894a5150dc2d0e15d9e112f39828855fe9080340cfd95de7731ee03b17899a49926e469e863c93a"

RPROVIDES:${PN} += "libRaTools.so.0()(64bit) libRaTools0 libRaTools0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
