SUMMARY = "Ceph RADOS Gateway backend for NFS-Ganesha"
DESCRIPTION = "This package contains the Ceph 'object' (RGW) File System Abstraction Layer \
(FSAL)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-rgw-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "c721e6d8744adf0ae769a4f0b3bc4bba3fc981ec1d251c6a15ffb3477010c62ca61a43ab927dab0942faa6025c7d6bc8a0cc78e5273998e480bb5fb23c112b43"

RPROVIDES:${PN} += "config(nfs-ganesha-rgw) \
libfsalrgw.so()(64bit) \
nfs-ganesha-rgw \
nfs-ganesha-rgw(aarch-64)"
RDEPENDS:${PN} += "ceph-common \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libganesha_nfsd.so.3.3()(64bit) \
librgw.so.2()(64bit) \
nfs-ganesha"

inherit rpm
