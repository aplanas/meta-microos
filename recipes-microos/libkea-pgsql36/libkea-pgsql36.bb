SUMMARY = "Kea PostgreSQL database library"
DESCRIPTION = "Kea's database library for PostgreSQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-pgsql36-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "c91936dcc8a1afbd8883cbebaad6a23818f7ab0e62ceb7595b5d356e664f14ffe399e747a799037720d0700a539c70c5177d3263a4c665a784edb9b95c4c232f"

RPROVIDES:${PN} += "libkea-pgsql.so.36()(64bit) libkea-pgsql36 libkea-pgsql36(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkea-asiolink.so.40()(64bit) libkea-cc.so.39()(64bit) libkea-database.so.35()(64bit) libkea-exceptions.so.13()(64bit) libkea-log.so.35()(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
