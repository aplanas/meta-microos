SUMMARY = "Library for reading media metadata (tags)"
DESCRIPTION = "libtaginfo is a convenience wrapper for taglib with C and vala \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.1"

RPM_NAME = "libtaginfo_c0-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "b7495687618cff5f8dbd3fcc9fe7fde347caad4ea9d883476126ec076b5458045a989f26378b2c09d851d39b086ce8e7a161f5b935881dd8b8a2c83cce32fa9f"

RPROVIDES:${PN} += "libtaginfo_c.so.0()(64bit) libtaginfo_c0 libtaginfo_c0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libtag.so.1()(64bit) libtaginfo.so.1()(64bit)"

inherit rpm
