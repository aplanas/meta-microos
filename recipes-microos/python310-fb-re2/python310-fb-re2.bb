SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python310-fb-re2-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "8fc43c262f44211be0ab17235f9e1691bfcee910f5496b5d8daf510e3455dc6f38d1ab1cbd4440d122499b6fc98b024a12acea1d97453a735e26f917db7b8f6b"

RPROVIDES:${PN} += "python3-fb-re2 \
python3.10dist(fb-re2) \
python310-fb-re2 \
python310-fb-re2(aarch-64) \
python3dist(fb-re2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libre2.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi)"

inherit rpm
