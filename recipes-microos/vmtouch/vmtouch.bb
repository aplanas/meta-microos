SUMMARY = "Portable file system cache diagnostics and control"
DESCRIPTION = "A tool for learning about and controlling the file system \
cache of unix and unix-like systems."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "vmtouch-1.3.1-1.11.aarch64.rpm"
RPM_HASH = "8d9aa01fb9544eb109af4c33250c18edc4474e470035bd4bf8c6ac122c1f816e87084c41c262de6bd7703ec5e5e4a9eae610178945441df58e847a8c2dbdc57d"

RPROVIDES:${PN} += "vmtouch \
vmtouch(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
