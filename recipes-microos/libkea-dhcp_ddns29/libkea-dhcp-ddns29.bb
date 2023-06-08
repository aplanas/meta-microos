SUMMARY = "Kea DHCP Dynamic DNS library"
DESCRIPTION = "This is a library of classes for sending and receiving requests used \
by ISC's DHCP-DDNS (aka D2) service to carry out DHCP-driven DNS \
updates."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcp_ddns29-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "011cf511d16499e99afe93583d62b7d53244666369195d597b0a52f0add5a303e5a05c160afef69ca520386e08478dbe83a947dd4e27267c32b7af2be25f640f"

RPROVIDES:${PN} += "libkea-dhcp_ddns.so.29()(64bit) libkea-dhcp_ddns29 libkea-dhcp_ddns29(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkea-asiolink.so.40()(64bit) libkea-cc.so.39()(64bit) libkea-cryptolink.so.28()(64bit) libkea-dhcp++.so.54()(64bit) libkea-dns++.so.30()(64bit) libkea-exceptions.so.13()(64bit) libkea-log.so.35()(64bit) libkea-stats.so.18()(64bit) libkea-util.so.52()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
