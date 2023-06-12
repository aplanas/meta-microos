SUMMARY = "Library and tools to access Microsoft Bitlocker Disk Encrypted partitions"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "python310-libbde-20221031-3.9.aarch64.rpm"
RPM_HASH = "e0bfcb5307a677ae8eb8eede9ec914c26508bb4a009a1b1f18a6a29960e7f1a7e07a9f436ce3b4705a2c5c3285301323e7b7189e3de179df5c58b71392750c7a"

RPROVIDES:${PN} += "python3-libbde \
python310-libbde \
python310-libbde(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbde.so.1()(64bit) \
libbde.so.1(V_20221031)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
python(abi)"

inherit rpm
