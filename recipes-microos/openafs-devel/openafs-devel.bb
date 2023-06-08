SUMMARY = "OpenAFS Static Libraries and Header Files"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs. This package contains the OpenAFS server."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-devel-1.8.9-2.9.aarch64.rpm"
RPM_HASH = "404707b894dabf293065013a1a2a01f0dfb073ff6a1d377edb4ce2d7fe1299738bc70c99e83dafcf715503f4cd86bf068e5a04623ed1c1c5c87e17d8986fef1c"

RPROVIDES:${PN} += "openafs-devel openafs-devel(aarch-64) perl(AFS::ukernel) perl(AFS::ukernelc)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libafshcrypto.so.2()(64bit) libc.so.6(GLIBC_2.36)(64bit) librokenafs.so.2()(64bit) openafs"

inherit rpm
