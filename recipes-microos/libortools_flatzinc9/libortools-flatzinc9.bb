SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools_flatzinc9-9.6-1.1.aarch64.rpm"
RPM_HASH = "a0e53e96467bfc86de55c2feae372e68a49b685e885f5408da87701190d9fe94030c318ca8e06c4f4a021a77ea91657308dd402a11be2a230f9369efa0091ce5"

RPROVIDES:${PN} += "libortools_flatzinc.so.9()(64bit) libortools_flatzinc9 libortools_flatzinc9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_flags_internal.so.2301.0.0()(64bit) libabsl_flags_marshalling.so.2301.0.0()(64bit) libabsl_flags_reflection.so.2301.0.0()(64bit) libabsl_hash.so.2301.0.0()(64bit) libabsl_log_internal_check_op.so.2301.0.0()(64bit) libabsl_log_internal_conditions.so.2301.0.0()(64bit) libabsl_log_internal_message.so.2301.0.0()(64bit) libabsl_log_internal_nullguard.so.2301.0.0()(64bit) libabsl_raw_hash_set.so.2301.0.0()(64bit) libabsl_str_format_internal.so.2301.0.0()(64bit) libabsl_strings.so.2301.0.0()(64bit) libabsl_throw_delegate.so.2301.0.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libortools.so.9()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
