SUMMARY = "OpenAFS File System Client"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs. This package contains the OpenAFS client."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-client-1.8.9-2.9.aarch64.rpm"
RPM_HASH = "4c3f3c709b04b1b4a58b8fc1ec8952b0ce140e10cf12188e9908795c164dbfb0b6241c1dee588b40a7807979f2767eb8eeda705f01ce05047b54b780a27a75b2"

RPROVIDES:${PN} += "config(openafs-client) openafs-client openafs-client(aarch-64)"
RDEPENDS:${PN} += "/bin/sh krb5-client ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libafshcrypto.so.2()(64bit) libc.so.6(GLIBC_2.36)(64bit) libk5crypto.so.3()(64bit) libk5crypto.so.3(k5crypto_3_MIT)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) librokenafs.so.2()(64bit) openafs openafs-kmp"

inherit rpm
