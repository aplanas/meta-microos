SUMMARY = "Corosync quorum library"
DESCRIPTION = "The quorum library is the external interface to the quorum service. \
This service is loaded into all nodes in a Corosync cluster and track \
the quorum status of a node."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libquorum5-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "736e35fbcb23c353c8445dc9d966c5014b1a48bf4a2793cddb4ab1bc8f84467f8ece5dcbe0778ca364b6e3b6a0fb47e5632d07c83bbaa9b4eda3ec5881abaf13"

RPROVIDES:${PN} += "libquorum.so.5()(64bit) libquorum.so.5(COROSYNC_QUORUM_1.0)(64bit) libquorum5 libquorum5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcorosync_common.so.4()(64bit) libqb.so.100()(64bit)"

inherit rpm
