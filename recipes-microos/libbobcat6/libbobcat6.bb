SUMMARY = "Shared library implementing C++ classes that are frequently used"
DESCRIPTION = "Bobcat is an acronym of `Brokken's Own Base Classes And Templates'. It is a \
shared library implementing C++ classes that are frequently used in software \
developed by Frank Brokken. All of Frank's C++ programs hosted at GitLab \
depend on `bobcat'."
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat6-6.02.02-2.3.aarch64.rpm"
RPM_HASH = "84b596dbe634587ce818092a5eaafd166f2f03d918acb3af7bd390ddf4b0994accee9073e6d112131387540c3ea7d6aa1a257bb7b00e90af349863243d0ca184"

RPROVIDES:${PN} += "libbobcat libbobcat.so.6()(64bit) libbobcat6 libbobcat6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
