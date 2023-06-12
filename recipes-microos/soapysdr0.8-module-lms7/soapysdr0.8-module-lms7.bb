SUMMARY = "SoapySDR LMS7 support module"
DESCRIPTION = "Soapy LMS7 - LimeSDR device support for Soapy SDR. \
A Soapy module that supports LimeSDR devices within the Soapy API."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "soapysdr0.8-module-lms7-22.09.1-2.2.aarch64.rpm"
RPM_HASH = "e1968146e996e7c005b45e1910d189d6f55f5f9ddbff7658115017332f33c4fb0a51b45ce26426daed96419e49745e58ffeeaacd54fb6fe582018f15141b392d"

RPROVIDES:${PN} += "libLMS7Support.so()(64bit) \
soapysdr0.8-module-lms7 \
soapysdr0.8-module-lms7(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLimeSuite.so.22.09-1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
