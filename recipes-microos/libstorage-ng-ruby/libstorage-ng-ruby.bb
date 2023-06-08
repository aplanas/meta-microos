SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.101"

RPM_NAME = "libstorage-ng-ruby-4.5.101-1.1.aarch64.rpm"
RPM_HASH = "bcb4e0aef805e0cc8c38ab2ec9d179dab3ffbaddb29fde2e0ebd142b60318b1e59192ceeae746d173b59ca783a5bfa0d61bf61878e6c21fb023532266ad2c4d7"

RPROVIDES:${PN} += "libstorage-ng-ruby libstorage-ng-ruby(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libruby3.2.so.3.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstorage-ng.so.1()(64bit) libstorage-ng1"

inherit rpm
