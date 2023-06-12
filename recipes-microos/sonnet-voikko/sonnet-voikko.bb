SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "sonnet-voikko-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "173dc571edc78aca1c03c64d427e83d71f760c3b6c2f01f4de4e616c38224fd9d9f97d4d97401034042796eb76ad81475cbba01734a51d93544e992a10e76a06"

RPROVIDES:${PN} += "locale(sonnet:fi) sonnet-voikko sonnet-voikko(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5SonnetCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libvoikko.so.1()(64bit) sonnet"

inherit rpm
