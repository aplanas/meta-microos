SUMMARY = "Library implementing the Raft consensus protocol"
DESCRIPTION = "This library is a fully asynchronous C implementation of the Raft consensus protocol. \
 \
It implements the core Raft algorithm logic and a pluggable interface defining I/O for \
networking and persistent storage. The algorithm supports leadership election, \
log replication, log compaction, and  membership changes. \
 \
A stock implementation of the I/O interface based on libuv is included."
LICENSE = "LGPL-3.0-only-WITH-LGPL-3.0-linking-exception"

PV = "0.17.1"

RPM_NAME = "libraft3-0.17.1-1.3.aarch64.rpm"
RPM_HASH = "27abfff2985b534b1331ab4864e3337023204eb3c331ae43539d03d744709b93c39624cc63f53a1fe391d980ca00458c2941ca1240416db067af1593000227c4"

RPROVIDES:${PN} += "libraft.so.3()(64bit) libraft3 libraft3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) liblz4.so.1()(64bit) libuv.so.1()(64bit)"

inherit rpm
