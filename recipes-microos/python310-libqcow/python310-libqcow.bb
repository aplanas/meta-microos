SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221124"

RPM_NAME = "python310-libqcow-20221124-3.9.aarch64.rpm"
RPM_HASH = "456e76259dd6d6c28779f2dfcff0c9a1b1c3b2525d4f58fc5b8d38ea4770f9d94709090ec1b1a3b488b7fe573ebd5e536a1a652501c80bb9927b3f79a6b7eae9"

RPROVIDES:${PN} += "python3-libqcow \
python310-libqcow \
python310-libqcow(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libqcow.so.1()(64bit) \
libqcow.so.1(V_20221124)(64bit) \
python(abi)"

inherit rpm
