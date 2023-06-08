SUMMARY = "Library and tools to access the GUID Partition Table (GPT) volume system format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "python39-libvsgpt-20221029-3.7.aarch64.rpm"
RPM_HASH = "2b4d4c4cc4fced64368898ab0e2b177787418b6cf5ba1fd84aadbf06675651c0aec432f954e028463bce29343ebfce1714a450f9f79754a44d26f0faf8b8acea"

RPROVIDES:${PN} += "python39-libvsgpt python39-libvsgpt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libvsgpt.so.1()(64bit) libvsgpt.so.1(V_20221029)(64bit) python(abi)"

inherit rpm
