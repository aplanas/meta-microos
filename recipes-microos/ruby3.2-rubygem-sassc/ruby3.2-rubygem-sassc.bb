SUMMARY = "Use libsass with Ruby!"
DESCRIPTION = "Use libsass with Ruby!."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby3.2-rubygem-sassc-2.4.0-2.14.aarch64.rpm"
RPM_HASH = "838ecce7f69a1294ded618d6730aa1e9e9c8b1c52e10b008bf6cabf7c241bad13b0507e76715d9b79c12e6f38b890f0cb93b2167b462adb4e4813749e538869a"

RPROVIDES:${PN} += "libsass.so()(64bit) ruby3.2-rubygem-sassc ruby3.2-rubygem-sassc(aarch-64) rubygem(ruby:3.2.0:sassc) rubygem(ruby:3.2.0:sassc:2) rubygem(ruby:3.2.0:sassc:2.4) rubygem(ruby:3.2.0:sassc:2.4.0) rubygem(sassc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ruby(abi) rubygem(ruby:3.2.0:ffi:1)"

inherit rpm
