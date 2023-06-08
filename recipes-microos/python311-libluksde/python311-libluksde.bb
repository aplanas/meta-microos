SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python311-libluksde-20221103-3.9.aarch64.rpm"
RPM_HASH = "15b673051eeccc8f9fbe46e15a8c9e415d7bd3c5811e46e6a0f6c76f5e9b54608acd1a0f380eb5f80c9e288952969fad0815a9b9dc9721313893acdb5923007b"

RPROVIDES:${PN} += "python311-libluksde python311-libluksde(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libluksde.so.1()(64bit) libluksde.so.1(V_20221103)(64bit) python(abi)"

inherit rpm
