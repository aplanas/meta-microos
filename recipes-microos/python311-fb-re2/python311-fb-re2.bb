SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python311-fb-re2-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "1afaea7d97e006b16dc17721a91491c3577aeb172d31c5d87dea24a89496179245db6a972ff4384120b9451a91fdad70a2448915afaa1d7699bab5ba0b16aa77"

RPROVIDES:${PN} += "python3.11dist(fb-re2) python311-fb-re2 python311-fb-re2(aarch-64) python3dist(fb-re2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libre2.so.10()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi)"

inherit rpm
