SUMMARY = "ZArchive library"
DESCRIPTION = "This subpackage contains the ZArchive library"
LICENSE = "MIT-0"

PV = "0.1.2+git20220908.d2c7177"

RPM_NAME = "libzarchive0_1-0.1.2+git20220908.d2c7177-2.1.aarch64.rpm"
RPM_HASH = "ffa2252256e2ee1028321caf88142df1c340af67336a236d3af83586eeae7fed520d39880952c3d009d2341fcd89a2907916ee0a07676831be204f2dfa894e70"

RPROVIDES:${PN} += "libzarchive.so.0.1()(64bit) libzarchive0_1 libzarchive0_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libzstd.so.1()(64bit)"

inherit rpm
