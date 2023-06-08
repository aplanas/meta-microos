SUMMARY = "Collection of software supporting LMS7-based hardware"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms including the LimeSDR, drivers for the LMS7002M transceiver \
RFIC, and other tools for developing with LMS7-based hardware. Lime \
Suite enables many SDR applications, such as GQRX for example, to \
work with supported hardware through the bundled SoapySDR support \
module."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-22.09.1-2.2.aarch64.rpm"
RPM_HASH = "297b31740a3f399e59a2c22a7a83570606b1f02105791e02fb3db66855771eeb8d4aed79741b2e340fb4836c57ee27c9f2953747a3b92173f302b349689b332f"

RPROVIDES:${PN} += "limesuite limesuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libLimeSuite.so.22.09-1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_gl-suse.so.9.0.0()(64bit) libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
