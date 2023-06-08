SUMMARY = "Tools to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "Tools to access the BitLocker Drive Encryption (BDE) format. The BDE \
format is used by Windows, as of Vista, to encrypt data on a storage \
media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221031"

RPM_NAME = "libbde-tools-20221031-3.9.aarch64.rpm"
RPM_HASH = "0bfb953eb3a7d5e0a170f7bdf174c4648e8c055bbc58810b02a65c0c3d3bef41581f0ccf9b4cc27a07c129f87f6ee48fa22b88d7e8d7b8098f8ad96a119af669"

RPROVIDES:${PN} += "libbde-tools libbde-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbde.so.1()(64bit) libbde.so.1(V_20221031)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcsplit.so.1()(64bit) libcsplit.so.1(V_20220109)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
