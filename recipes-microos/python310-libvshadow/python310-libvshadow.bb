SUMMARY = "Library to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "python310-libvshadow-20221030-3.5.aarch64.rpm"
RPM_HASH = "3f2e63f8431ede72807d630969e20c40f9098f40b918ae6ee3d0040aa1752d897bd3f8c1f06bb477e45ed54478b714c9903328841f4e8400359b0efb62f41504"

RPROVIDES:${PN} += "python3-libvshadow python310-libvshadow python310-libvshadow(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libvshadow.so.1()(64bit) libvshadow.so.1(V_20221030)(64bit) python(abi)"

inherit rpm
