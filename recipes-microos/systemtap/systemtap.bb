SUMMARY = "Instrumentation System"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
Developers can write instrumentation to collect data on the operation \
of the system."
LICENSE = "GPL-2.0-or-later"

PV = "4.7"

RPM_NAME = "systemtap-4.7-2.1.aarch64.rpm"
RPM_HASH = "3affcc496f1e04aeb9ce7de874d3db831d1dd4bc92ada44753eea1cd665261a0c4da1c473dbf363a6b103fed30c2f3c9809bae899487849d88bdf2cd5091195b"

RPROVIDES:${PN} += "systemtap systemtap(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.122)(64bit) libdw.so.1(ELFUTILS_0.126)(64bit) libdw.so.1(ELFUTILS_0.127)(64bit) libdw.so.1(ELFUTILS_0.130)(64bit) libdw.so.1(ELFUTILS_0.138)(64bit) libdw.so.1(ELFUTILS_0.142)(64bit) libdw.so.1(ELFUTILS_0.143)(64bit) libdw.so.1(ELFUTILS_0.148)(64bit) libdw.so.1(ELFUTILS_0.149)(64bit) libdw.so.1(ELFUTILS_0.157)(64bit) libdw.so.1(ELFUTILS_0.158)(64bit) libdw.so.1(ELFUTILS_0.161)(64bit) libdw.so.1(ELFUTILS_0.167)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10)(64bit) libnss3.so(NSS_3.12.5)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.5)(64bit) libnss3.so(NSS_3.9.2)(64bit) libsqlite3.so.0()(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.12.6)(64bit) libssl3.so(NSS_3.2)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) systemtap-dtrace systemtap-runtime"

inherit rpm
