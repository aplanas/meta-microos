SUMMARY = "Shared and private libraries of molequeue"
DESCRIPTION = "Shared and private libraries of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-libs0-0.9.0-3.9.aarch64.rpm"
RPM_HASH = "a8e1cb14eb661c17eae9c798bc2f8429499196f918a650aabe87cb91b988016985cf9e158e905015676190054c8142a24372e7e4f5e752d8e314c06c43058f9b"

RPROVIDES:${PN} += "libMoleQueueClient.so()(64bit) libMoleQueueServerCore.so()(64bit) molequeue-libs0 molequeue-libs0(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
