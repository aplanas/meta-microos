SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python311-libvsgpt-20221029-3.7.aarch64.rpm"
RPM_HASH = "f2e20f96e9fe3a667ad0df9db52fd95159d7afd40b58b2a52e2c12269591b8ec63c52116d2326194499cee6b33677998934cbe83fa7f59172278250ae7dd0307"

RPROVIDES:${PN} += "python311-libvsgpt \
python311-libvsgpt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libvsgpt.so.1()(64bit) \
libvsgpt.so.1(V_20221029)(64bit) \
python(abi)"

inherit rpm
