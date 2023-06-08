SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization, tuned for \
tackling the world's toughest problems in vehicle routing, flows, \
integer and linear programming, and constraint programming."
LICENSE = "Apache-2.0"

PV = "9.4"

RPM_NAME = "google-or-tools-9.4-2.9.aarch64.rpm"
RPM_HASH = "21b804f6583d9987d7da654539fc72419bf922ed4e988a11d39edc8e7d6d2f4865015b741fef43c31dc1f76008466d11bb73ae351d3ea7e5c5bca5b66040a208"

RPROVIDES:${PN} += "google-or-tools google-or-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_flags_internal.so.2206.0.0()(64bit) libabsl_flags_marshalling.so.2206.0.0()(64bit) libabsl_flags_parse.so.2206.0.0()(64bit) libabsl_flags_reflection.so.2206.0.0()(64bit) libabsl_flags_usage.so.2206.0.0()(64bit) libabsl_hash.so.2206.0.0()(64bit) libabsl_random_internal_pool_urbg.so.2206.0.0()(64bit) libabsl_random_internal_randen.so.2206.0.0()(64bit) libabsl_random_internal_randen_hwaes_impl.so.2206.0.0()(64bit) libabsl_random_internal_randen_slow.so.2206.0.0()(64bit) libabsl_raw_hash_set.so.2206.0.0()(64bit) libabsl_status.so.2206.0.0()(64bit) libabsl_str_format_internal.so.2206.0.0()(64bit) libabsl_strings.so.2206.0.0()(64bit) libabsl_time.so.2206.0.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.35)(64bit) libortools.so.9()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
