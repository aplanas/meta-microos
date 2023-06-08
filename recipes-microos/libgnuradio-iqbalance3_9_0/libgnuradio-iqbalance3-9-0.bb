SUMMARY = "Libraries for gr-iqbal"
DESCRIPTION = "I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance3_9_0-0.39.0git20210108-1.12.aarch64.rpm"
RPM_HASH = "ff45b610eb1374aa7d91a982b165b82b8e1620659594b9454f8659c32ced42013c24c2c0af9be71153520b907d92601ca0e54549e55424beb6affcc574ddcfb4"

RPROVIDES:${PN} += "libgnuradio-iqbalance.so.3.9.0()(64bit) libgnuradio-iqbalance3_9_0 libgnuradio-iqbalance3_9_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgnuradio-pmt.so.3.10.6()(64bit) libgnuradio-runtime.so.3.10.6()(64bit) libosmodsp.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
