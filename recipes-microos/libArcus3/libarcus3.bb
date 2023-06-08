SUMMARY = "3D printer control software"
DESCRIPTION = "Communication library between internal components for Ultimaker software"
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus3-4.13.1-3.12.aarch64.rpm"
RPM_HASH = "3c96133144b45671d432ed22fbfd5263fcb6e9e9bc5c9d40daf5b451003d668c316d9c47e41ed54cec91b87a18a8e91ebdcfbbdbeb96ca489aeed08c98487f55"

RPROVIDES:${PN} += "libArcus-Ultimaker libArcus.so.3()(64bit) libArcus3 libArcus3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
