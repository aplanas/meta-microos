SUMMARY = "Userspace iWarp Port Mapper daemon"
DESCRIPTION = "iwpmd provides a userspace service for iWarp drivers to claim \
tcp ports through the standard socket interface."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "iwpmd-42.0-2.3.aarch64.rpm"
RPM_HASH = "50419f5acb178104c6649905e180fd8f9c85f8c428171581553c74f2a9a4a0ad9052486548e5c92123b109f48b4caee4d75e81ef98d8ea0553a9c6d839db1d45"

RPROVIDES:${PN} += "config(iwpmd) iwpmd iwpmd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) rdma-core(aarch-64) systemd"

inherit rpm
