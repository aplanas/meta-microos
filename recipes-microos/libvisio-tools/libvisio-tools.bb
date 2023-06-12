SUMMARY = "Tools to work with documents in MS Visio file-format"
DESCRIPTION = "This package contains tools to work with documents in MS Visio file-format."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-tools-0.1.7-1.27.aarch64.rpm"
RPM_HASH = "a86bcf27fc40e5a862b60c6bda1140f815d4ad4b4db74731ea77ac52ca5b2e8293544bde5c80310018c23568f09ee571121d737a9f130b2931f38d0f746da935"

RPROVIDES:${PN} += "libvisio-tools libvisio-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libvisio-0.1.so.1()(64bit)"

inherit rpm
