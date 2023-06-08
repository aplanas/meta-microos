SUMMARY = "Python bindings for GDCM"
DESCRIPTION = "A Python module for interfacing with the GDCM library."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "python3-gdcm-3.0.21-1.4.aarch64.rpm"
RPM_HASH = "ffbf4e5a43febb86de00f2f418efb31b363c0c734930085b17b5d92da786a1684d5319a4e33a45a2f7dd1def2f2826900472cb0e344baa912346adedf3ccb40e"

RPROVIDES:${PN} += "python3-gdcm python3-gdcm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdcm3_0 libgdcmCommon.so.3.0()(64bit) libgdcmDICT.so.3.0()(64bit) libgdcmDSED.so.3.0()(64bit) libgdcmIOD.so.3.0()(64bit) libgdcmMEXD.so.3.0()(64bit) libgdcmMSFF.so.3.0()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
