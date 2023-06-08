SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kconf_update5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "d5eacdd7c591da46be2785fd7a16d879f16ac9cb384bd64f83e81da2e426da1d048601972fd9aed4ab44579222ac47bc80a53f44b8db84e2a500ddeb6414dc62"

RPROVIDES:${PN} += "kconf_update5 kconf_update5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigCore5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
