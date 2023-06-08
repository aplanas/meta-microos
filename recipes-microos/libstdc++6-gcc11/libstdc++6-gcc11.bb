SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libstdc++6-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "af3b3f7c9a5f59bfddea45b74263db844864b76e22afc837954bb1bc82efda38903c2e96ae3dd36d623dff35daf35aeb226e0abe7025fc86464dcca089dae2f3"

RPROVIDES:${PN} += "libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.10)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.12)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.4)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.6)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(CXXABI_TM_1)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.1)(64bit) libstdc++.so.6(GLIBCXX_3.4.10)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.12)(64bit) libstdc++.so.6(GLIBCXX_3.4.13)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.16)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.2)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.23)(64bit) libstdc++.so.6(GLIBCXX_3.4.24)(64bit) libstdc++.so.6(GLIBCXX_3.4.25)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.27)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.3)(64bit) libstdc++.so.6(GLIBCXX_3.4.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.6)(64bit) libstdc++.so.6(GLIBCXX_3.4.7)(64bit) libstdc++.so.6(GLIBCXX_3.4.8)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstdc++6 libstdc++6-gcc11 libstdc++6-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
