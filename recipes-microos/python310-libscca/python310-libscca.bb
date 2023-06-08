SUMMARY = "Library and tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "Library and tools to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "python310-libscca-20221027-3.7.aarch64.rpm"
RPM_HASH = "f34fbfe8fd067fe068a8196d4a50e265ad3f487e2251ee2a5827aba41aee8490913d91602a67e9aa418ec4ae6b10cdc22aa1c0241ad5cdc2007b13dc4e7dc4a8"

RPROVIDES:${PN} += "python3-libscca python310-libscca python310-libscca(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libscca.so.1()(64bit) libscca.so.1(V_20221027)(64bit) python(abi)"

inherit rpm
