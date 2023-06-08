SUMMARY = "Library and tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Read-only supported HFS formats: \
 \
* HFS+, Mac OS 10.3 and later (Unicode 3.2 case-insensitive) \
* HFSX, Mac OS 10.3 and later (Unicode 3.2 case-sensitive) \
 \
Unsupported HFS formats: \
 \
* (traditional) HFS \
* HFS+, Mac OS 8.1 through 10.2 (Unicode 2.1 case-insensitive) \
* HFSX, Mac OS 8.1 through 10.2 (Unicode 2.1 case-sensitive) \
 \
Supported HFS format features: \
 \
* ZLIB (DEFLATE) compression \
* LZVN compression \
* extended attributes \
 \
Unsupported HFS format features: \
 \
* LZFSE compression, compression methods 11 and 12 \
* 'uncompressed', compression methods 1, 9 and 10"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "python310-libfshfs-20220831-3.9.aarch64.rpm"
RPM_HASH = "ce8d8ff7f2a4e20a8dd6eb1d61dc5fc71fd07e9f01eb6bb0d99c9016bf271fd02588fa29db227535517293e9058d2f199b1b32df7f3bd0e2a54f052371ea19c8"

RPROVIDES:${PN} += "python3-libfshfs python310-libfshfs python310-libfshfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfshfs.so.1()(64bit) libfshfs.so.1(V_20220831)(64bit) python(abi)"

inherit rpm
