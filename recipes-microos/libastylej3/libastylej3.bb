SUMMARY = "Java bindings for astyle"
DESCRIPTION = "This package contains Java bindings for astyle."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "libastylej3-3.1-2.16.aarch64.rpm"
RPM_HASH = "7400dbf7adba289ff3929154f8e0bc363ec25dc9db61d501153b8047cbaac804c156e6aa96cabd975825e0ec63741cabe49b119d3d83d05286d0dd32a35e6105"

RPROVIDES:${PN} += "libastylej.so.3()(64bit) libastylej3 libastylej3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
