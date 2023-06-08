SUMMARY = "Remote device support for Soapy SDR"
DESCRIPTION = "A Soapy module that supports remote devices within the Soapy API."
LICENSE = "BSL-1.0"

PV = "0.5.2"

RPM_NAME = "soapysdr0.8-module-remote-0.5.2-3.8.aarch64.rpm"
RPM_HASH = "bd1b0ebad9fe34e0e8dba45f3676f55b03511014583a37603f6a641fd22b6c5bee44b910d507a19350a0bb800a5e9a8a106e075a0e89c4f35fcc0b69f3f21d7a"

RPROVIDES:${PN} += "libremoteSupport.so()(64bit) soapy-remote-module soapysdr0.8-module-remote soapysdr0.8-module-remote(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSoapySDR.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
