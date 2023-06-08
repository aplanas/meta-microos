SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.8"

RPM_NAME = "modsecurity-3.0.8-1.4.aarch64.rpm"
RPM_HASH = "a96deeaf84d54bc1cb01fab4dcda4b6ee6dbd7d60c74bcae890c7521d27bed0e808c86e3d7386238a5ea01bf65272b6630bff3ae891e1a1e49be9b3dc28d026b"

RPROVIDES:${PN} += "modsecurity modsecurity(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libmodsecurity.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
