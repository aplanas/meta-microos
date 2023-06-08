SUMMARY = "Library and tools to access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs is a library to access the Apple File System (APFS). \
 \
Read-only supported APFS formats: \
 \
* version 2 \
 \
Supported APFS format features: \
 \
* ZLIB (DEFLATE) compression \
* LZVN compression \
* encryption \
 \
Unsupported APFS format features: \
 \
* APFS version 1 \
* Fusion drive (NX_INCOMPAT_FUSION) \
* snapshots \
* LZFSE compression, compression methods 11 and 12 \
* 'uncompressed', compression methods 1, 9 and 10 \
* T2 encryption"
LICENSE = "LGPL-3.0-only"

PV = "20221102"

RPM_NAME = "python311-libfsapfs-20221102-3.11.aarch64.rpm"
RPM_HASH = "812e7877466c48ac6c637db5068a9522d3f5fb0a206331aec3c7446df37bb4b884989e5fa403b211757d5972dcb466159c4f3b27658ce162ff5f83605b96178c"

RPROVIDES:${PN} += "python311-libfsapfs python311-libfsapfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfsapfs.so.1()(64bit) libfsapfs.so.1(V_20221102)(64bit) python(abi)"

inherit rpm
