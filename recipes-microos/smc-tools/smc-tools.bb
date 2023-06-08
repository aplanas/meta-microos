SUMMARY = "Shared Memory Communication via RDMA"
DESCRIPTION = "Shared Memory Communication via RDMA (SMC) is a socket over RDMA \
communication protocol that allows existing TCP socket applications to \
transparently benefit from RDMA when exchanging data via an RDMA over \
Converged Ethernet (RoCE) network. \
 \
The tools provided in this package allow existing TCP applications \
to use a RoCE network without needing to make changes in them."
LICENSE = "EPL-1.0"

PV = "1.8.2"

RPM_NAME = "smc-tools-1.8.2-1.2.aarch64.rpm"
RPM_HASH = "9e25bb1f091e50eec90631862b9130aef9f29ac8f902c8b3e126b493bbcbb5196830550a7acf136fc72dc06b4605c65d0643c100d7f724bdad5f337cf897fc23"

RPROVIDES:${PN} += "libsmc-preload.so.1()(64bit) smc-tools smc-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-genl-3.so.200()(64bit) libnl-genl-3.so.200(libnl_3)(64bit) permissions"

inherit rpm
