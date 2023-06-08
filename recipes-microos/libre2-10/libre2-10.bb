SUMMARY = "C++ fast alternative to backtracking RE engines"
DESCRIPTION = "RE2 is a C++ library providing a fast, safe, thread-friendly alternative to \
backtracking regular expression engines like those used in PCRE, Perl, and \
Python. \
 \
Backtracking engines are typically full of features and convenient syntactic \
sugar but can be forced into taking exponential amounts of time on even small \
inputs. \
 \
In contrast, RE2 uses automata theory to guarantee that regular expression \
searches run in time linear in the size of the input, at the expense of some \
missing features (e.g. back references and generalized assertions)."
LICENSE = "BSD-3-Clause"

PV = "20230301"

RPM_NAME = "libre2-10-20230301-53.3.aarch64.rpm"
RPM_HASH = "9ad10a023de08bd526309f12a9357a29cf1a1a6986496d83f51aab3f72f2775d6c4f8d80e41475fd4bc3097f8645dc9cc5e2d2df51396ae13552789fb982de2f"

RPROVIDES:${PN} += "libre2-10 libre2-10(aarch-64) libre2.so.10()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
