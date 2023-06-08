SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Python3 bindings for the OR-Tools suite, for solving combinatorial \
optimization problems."
LICENSE = "Apache-2.0"

PV = "9.4"

RPM_NAME = "python3-ortools-9.4-2.9.aarch64.rpm"
RPM_HASH = "19d42ef8d7095486199d88e53c108d7ed8dafb96175c447bed150e349443bef098549157ffa1db20a04d52f6afbbc52e0bf8d223f72f78b67326614706828fed"

RPROVIDES:${PN} += "python3-ortools python3-ortools(aarch-64) python3.10dist(ortools) python3dist(ortools)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_flags_internal.so.2206.0.0()(64bit) libabsl_hash.so.2206.0.0()(64bit) libabsl_raw_hash_set.so.2206.0.0()(64bit) libabsl_status.so.2206.0.0()(64bit) libabsl_str_format_internal.so.2206.0.0()(64bit) libabsl_strings.so.2206.0.0()(64bit) libabsl_throw_delegate.so.2206.0.0()(64bit) libabsl_time.so.2206.0.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libortools.so.9()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
