SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.4"

RPM_NAME = "libortools_flatzinc9-9.4-2.9.aarch64.rpm"
RPM_HASH = "962923781a2355a1764d4b903f1b4cbf84f6440244f1a121d6023980627f84c85fd1c4c1b4c4dfc6e2ce8e17be81119046004be5730c188eb70d18b98d0e306e"

RPROVIDES:${PN} += "libortools_flatzinc.so.9()(64bit) libortools_flatzinc9 libortools_flatzinc9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_flags_internal.so.2206.0.0()(64bit) libabsl_flags_marshalling.so.2206.0.0()(64bit) libabsl_flags_reflection.so.2206.0.0()(64bit) libabsl_hash.so.2206.0.0()(64bit) libabsl_raw_hash_set.so.2206.0.0()(64bit) libabsl_str_format_internal.so.2206.0.0()(64bit) libabsl_strings.so.2206.0.0()(64bit) libabsl_throw_delegate.so.2206.0.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libortools.so.9()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
