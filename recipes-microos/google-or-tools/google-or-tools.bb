SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization, tuned for \
tackling the world's toughest problems in vehicle routing, flows, \
integer and linear programming, and constraint programming."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-9.6-1.1.aarch64.rpm"
RPM_HASH = "b164e25a65c4150798dc120a10b6624030252946cb372642b66f45386c7571eaa9bd14d2e370f6001f8f5a5d48b662318e64e950ce47bba99b6343ce31f92b16"

RPROVIDES:${PN} += "google-or-tools google-or-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_flags_internal.so.2301.0.0()(64bit) libabsl_flags_marshalling.so.2301.0.0()(64bit) libabsl_flags_parse.so.2301.0.0()(64bit) libabsl_flags_reflection.so.2301.0.0()(64bit) libabsl_flags_usage.so.2301.0.0()(64bit) libabsl_hash.so.2301.0.0()(64bit) libabsl_log_flags.so.2301.0.0()(64bit) libabsl_log_initialize.so.2301.0.0()(64bit) libabsl_log_internal_check_op.so.2301.0.0()(64bit) libabsl_log_internal_message.so.2301.0.0()(64bit) libabsl_log_internal_nullguard.so.2301.0.0()(64bit) libabsl_random_internal_pool_urbg.so.2301.0.0()(64bit) libabsl_random_internal_randen.so.2301.0.0()(64bit) libabsl_random_internal_randen_hwaes_impl.so.2301.0.0()(64bit) libabsl_random_internal_randen_slow.so.2301.0.0()(64bit) libabsl_raw_hash_set.so.2301.0.0()(64bit) libabsl_status.so.2301.0.0()(64bit) libabsl_str_format_internal.so.2301.0.0()(64bit) libabsl_strings.so.2301.0.0()(64bit) libabsl_time.so.2301.0.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libortools.so.9()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
