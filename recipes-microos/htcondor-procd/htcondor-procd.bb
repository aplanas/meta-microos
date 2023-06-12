SUMMARY = "HTCondor Process tracking Daemon"
DESCRIPTION = "A daemon for tracking child processes started by a parent. \
Part of HTCondor, but able to be stand-alone"
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-procd-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "5963524c640d2bd34e80d917f007d77e98261a7dea9da6937be21cf636877cd175cba6bf6beb9456b1ebce160035fc579dd9b378c5d75984894010aa554c6d7f"

RPROVIDES:${PN} += "htcondor-procd \
htcondor-procd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
