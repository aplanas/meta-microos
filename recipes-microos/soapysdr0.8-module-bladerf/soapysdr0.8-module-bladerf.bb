SUMMARY = "SoapySDR BladeRF module"
DESCRIPTION = "Soapy BladeRF - BladeRF device support for Soapy SDR. \
A Soapy module that supports BladeRF devices within the Soapy API."
LICENSE = "LGPL-2.1"

PV = "0.4.1"

RPM_NAME = "soapysdr0.8-module-bladerf-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "6b7de8404782c2385ad4f6a3ae1c746d187c7adb7be8a4195131181f6c2f3a7e0366d2a4352f131e09bdba71d1acfca3c5b0f5c440a084b68809f9a8c38d2d8d"

RPROVIDES:${PN} += "libbladeRFSupport.so()(64bit) soapysdr0.8-module-bladerf soapysdr0.8-module-bladerf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSoapySDR.so.0.8()(64bit) libbladeRF.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
