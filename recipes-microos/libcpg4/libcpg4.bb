SUMMARY = "Corosync group message API"
DESCRIPTION = "A group message API called CPG, part of Corosync. This library is \
used to create distributed applications that operate properly during \
cluster partitions, merges, and faults."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcpg4-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "cfa5190562876d762fc0dae3361e999aac9b90c2ba81ad2766590dca7e1f040390995b27f647b36cd55a01ac861a260b5d8284020b308814b0fec40744217410"

RPROVIDES:${PN} += "libcpg.so.4()(64bit) \
libcpg.so.4(COROSYNC_CPG_1.0)(64bit) \
libcpg4 \
libcpg4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcorosync_common.so.4()(64bit) \
libqb.so.100()(64bit)"

inherit rpm
