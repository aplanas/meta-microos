SUMMARY = "Daemon to manage RDMA Node Description"
DESCRIPTION = "rdma-ndd is a system daemon which watches for rdma device changes and/or \
hostname changes and updates the Node Description of the rdma devices based \
on those changes."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "rdma-ndd-42.0-2.3.aarch64.rpm"
RPM_HASH = "394259fc86a71c07b40e23c8f6b22fe853112ee37d1edcf2bee9c867e3c9fd12639973754a70ca1cc57c6dc339b02a96d074015b57e18c0e6577ef6e79a4352f"

RPROVIDES:${PN} += "rdma-ndd rdma-ndd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) rdma-core systemd"

inherit rpm
