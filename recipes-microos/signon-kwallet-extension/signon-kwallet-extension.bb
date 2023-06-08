SUMMARY = "KWallet integration for signon framework"
DESCRIPTION = "KWallet integration for signon framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "signon-kwallet-extension-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "68b6c5e5b0c0762646557ba3de5383fd02aefacf17d506e5e2edf78ca9d1d66a299dcdfb72aa38467778e4dbbc0b8719d376bdf571af171146876f679fd8f231"

RPROVIDES:${PN} += "libkeyring-kwallet.so()(64bit) signon-kwallet-extension signon-kwallet-extension(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Wallet.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libsignon-extension.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
