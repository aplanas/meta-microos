SUMMARY = "Library to Deal with Matroska Files"
DESCRIPTION = "Libmatroska is a C++ library to parse Matroska files (.mkv and .mka). \
It depends on libebml to work. You only need this package to compile \
your own applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libmatroska7-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "ef7611e087d49df93553df0a0a9a07af9a39672158e793b9c7e22df1a3b0ced08cad9f8805a465a72805aa7247dcd9ae9d80ee34d6a9027710d780b98a717bb7"

RPROVIDES:${PN} += "libmatroska.so.7()(64bit) libmatroska.so.7(V_1.7.0)(64bit) libmatroska7 libmatroska7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libebml.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
