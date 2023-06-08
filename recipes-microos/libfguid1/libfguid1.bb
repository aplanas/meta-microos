SUMMARY = "A library for GUID/UUID data types"
DESCRIPTION = "A library for GUID/UUID data types. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220113"

RPM_NAME = "libfguid1-20220113-3.2.aarch64.rpm"
RPM_HASH = "83a367faf24689ea8210df3064e50e901ef8669998c423276499fdc0f2e7f7487e4b2d86ea0a9ee80fa98773f4b102ca2d0f2ef8a2e3f87a2715b5df54b9efa5"

RPROVIDES:${PN} += "libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfguid1 libfguid1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit)"

inherit rpm
