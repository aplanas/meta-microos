SUMMARY = "SLURM plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by SLURM jobs or partitions."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-slurm-2.34-10.2.aarch64.rpm"
RPM_HASH = "98395b3152be3ea1c0afb4d7fa6aebe363a11c257c974ec7b1ec60104fa4060afb0eea0f199239a0fcdae46df17d4ae4ee35737d68e5780335db586f6974e05b"

RPROVIDES:${PN} += "pdsh-slurm pdsh-slurm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libslurm.so.39()(64bit) pdsh"

inherit rpm
