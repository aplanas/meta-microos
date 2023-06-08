SUMMARY = "Rate limiting data piping tool"
DESCRIPTION = "Sluice reads from standard input and write to standard output at a specified \
data rate. This can be useful for benchmarking and exercising I/O streaming at \
desired throughput rates."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.13"

RPM_NAME = "sluice-0.02.13-1.8.aarch64.rpm"
RPM_HASH = "ae1fe596de3c6219efb4df8a5c6e28380526db9ab43e205bb954438c207c9e87d6386d8cb985e40e19983411c9ae9e695b38491aff597cc57da822530699aef6"

RPROVIDES:${PN} += "sluice sluice(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
