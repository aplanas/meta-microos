SUMMARY = "YAML parser and emitter in C++"
DESCRIPTION = "A YAML parser and emitter in C++ matching the YAML 1.2 spec."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "libyaml-cpp0_7-0.7.0-1.7.aarch64.rpm"
RPM_HASH = "4d2de74acf0de0b388cee0aff384a9dc10991f30b45683a4fdb0892237fe4eeda3d652ff7abf582602ad29b5ff91459f9d1414eca10f3609fe2a5769b7234fcb"

RPROVIDES:${PN} += "libyaml-cpp.so.0.7()(64bit) libyaml-cpp0_7 libyaml-cpp0_7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
