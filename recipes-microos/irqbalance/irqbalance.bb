SUMMARY = "Daemon to balance IRQs on SMP machines"
DESCRIPTION = "irqbalance dynamically switches the CPUs for IRQs to prevent cpu0 from \
being used for all IRQs."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.2"

RPM_NAME = "irqbalance-1.9.2-3.3.aarch64.rpm"
RPM_HASH = "3abd8fb1aab014c38a9dbbec6aa2e973cefdaed674e2cdd9efee5b4070b88b452e2bf7fc3e68c6e395bb8ef99506dbf66870b4c92dfd446a3015e28499be92b0"

RPROVIDES:${PN} += "irqbalance irqbalance(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libglib-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit)"

inherit rpm
