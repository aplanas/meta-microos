SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.4"

RPM_NAME = "google-or-tools-minizinc-9.4-2.9.aarch64.rpm"
RPM_HASH = "233a70a19b68c0a933f1b761241b5a00b0b0850a0a64652abc624e50dd93fb342e23e5221b5aa62a6701d7951573646fc8b115767bd8d435d7fc0b5a24381464"

RPROVIDES:${PN} += "google-or-tools-minizinc google-or-tools-minizinc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_flags_internal.so.2206.0.0()(64bit) libabsl_flags_marshalling.so.2206.0.0()(64bit) libabsl_flags_parse.so.2206.0.0()(64bit) libabsl_flags_reflection.so.2206.0.0()(64bit) libabsl_flags_usage.so.2206.0.0()(64bit) libabsl_raw_hash_set.so.2206.0.0()(64bit) libabsl_strings.so.2206.0.0()(64bit) libabsl_time.so.2206.0.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libortools.so.9()(64bit) libortools_flatzinc.so.9()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) minizinc"

inherit rpm
