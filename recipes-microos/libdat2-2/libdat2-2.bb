SUMMARY = "DAPL runtime libraries"
DESCRIPTION = "libdat and libdapl provide a userspace RDMA API that supports DAT 2.0 \
specification and IB transport extensions for atomic operations and \
rdma write with immediate data. \
 \
This package contains the runtime libraries."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "libdat2-2-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "e8a5a2c757c04ead76138b1b5a133aab10a677674859719559ae5612c637faf5189f435750b1dfd23bee3f6dc32dd9ccf3037265b022a19f6f66fd6adf3e9fec"

RPROVIDES:${PN} += "dapl2 \
libdat2-2 \
libdat2-2(aarch-64) \
libdat2.so.2()(64bit) \
libdat2.so.2(DAT_2.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
dapl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
