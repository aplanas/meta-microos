SUMMARY = "Output IMA/EVM extended attributes in a human readable format"
DESCRIPTION = "This is a small utility that supplements ima-evm-utils with a way to inspect \
the security.ima and security.evm extended attributes in human readable \
format."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15"

RPM_NAME = "ima-inspect-0.15-1.1.aarch64.rpm"
RPM_HASH = "51d1670face6e0192f1c151696d57920ed842be44fa7b2222fb3ecd6e68584d8d684d5ad3a33db70b75e169fc21e5a766360376eda8757578b9a5280de8ee27b"

RPROVIDES:${PN} += "ima-inspect ima-inspect(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
