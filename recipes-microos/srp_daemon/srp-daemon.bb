SUMMARY = "Tools for using the InfiniBand SRP protocol devices"
DESCRIPTION = "In conjunction with the kernel ib_srp driver, srp_daemon allows you to \
discover and use SCSI devices via the SCSI RDMA Protocol over InfiniBand."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "srp_daemon-42.0-2.3.aarch64.rpm"
RPM_HASH = "f2625137b049a9410ef9db842bc853e4fcbbd52e422240336289930aff3618ef08a34750f9997e34af44b41df9a37ada7ab3fec76af517ed1e76c99a71a26528"

RPROVIDES:${PN} += "config(srp_daemon) srp_daemon srp_daemon(aarch-64) srptools"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit) libibverbs.so.1()(64bit) libibverbs.so.1(IBVERBS_1.0)(64bit) libibverbs.so.1(IBVERBS_1.1)(64bit) libibverbs.so.1(IBVERBS_1.5)(64bit) rdma-core systemd"

inherit rpm
