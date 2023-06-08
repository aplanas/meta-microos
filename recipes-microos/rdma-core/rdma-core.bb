SUMMARY = "RDMA core userspace libraries and daemons"
DESCRIPTION = "RDMA core userspace infrastructure and documentation, including initialization \
scripts, kernel driver-specific modprobe override configs, IPoIB network \
scripts, dracut rules, and the rdma-ndd utility."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "rdma-core-42.0-2.3.aarch64.rpm"
RPM_HASH = "bfe3de47fc214245e73b6866c2387771463ff0a3bdcacefe44b866bd84811c7d2e528b575501edde1cb2742d121d7da72d988e069e00e62a42110cc3959c7850"

RPROVIDES:${PN} += "config(rdma-core) ofed rdma rdma-core rdma-core(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh kmod ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) systemd udev"

inherit rpm
