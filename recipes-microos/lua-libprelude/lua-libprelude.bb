SUMMARY = "Lua bindings for libprelude"
DESCRIPTION = "Lua bindings for libprelude generated by SWIG."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "lua-libprelude-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "81e5a8f7150d6548de31231fc791a4411e599e92d4504299a534584f7efa5ae2ed5946575d6d594412e4424470be7aadf5c3eb957631fe0f680c7ded23a11a6c"

RPROVIDES:${PN} += "lua-libprelude \
lua-libprelude(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblua5.4.so.5()(64bit) \
libprelude.so.28()(64bit) \
libprelude28 \
libpreludecpp.so.12()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
lua"

inherit rpm
