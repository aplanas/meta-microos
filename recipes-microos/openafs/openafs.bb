SUMMARY = "OpenAFS Distributed File System"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-1.8.9-2.9.aarch64.rpm"
RPM_HASH = "eeb1b837b211d0af145b8a43ff41719ff464485681138a2f638d16f35941e67e19031393aa5b5c3234e92bdd800eeee4720a29439c2283cff428cb8c7436cbd8"

RPROVIDES:${PN} += "config(openafs) libafshcrypto.so.2()(64bit) librokenafs.so.2()(64bit) openafs openafs(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
