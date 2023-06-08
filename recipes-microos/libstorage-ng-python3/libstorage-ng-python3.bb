SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.101"

RPM_NAME = "libstorage-ng-python3-4.5.101-1.1.aarch64.rpm"
RPM_HASH = "9ff999da24dd3170f1df75ca2e35f0fb9186157f54de9f03cd014a2552c8c0f9a71791ae0525d13edc1b8e61c5741b434feb40351b9f43f8d28d86f49cbd9464"

RPROVIDES:${PN} += "libstorage-ng-python3 libstorage-ng-python3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstorage-ng.so.1()(64bit) libstorage-ng1 python(abi)"

inherit rpm
