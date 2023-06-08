SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "sonnet-voikko-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7ee3208c23b9ce8504f339631a80eb9d0d57b21a8e5b447022374ff0e37314e8690eb3b2b385a52cdcf2134ce405369933cc51e17072ace4eb613c6b363bf122"

RPROVIDES:${PN} += "locale(sonnet:fi) sonnet-voikko sonnet-voikko(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5SonnetCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libvoikko.so.1()(64bit) sonnet"

inherit rpm
