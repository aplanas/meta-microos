SUMMARY = "Open Knowledgebase of Interatomic Models KIM API"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package can be used to load all the files (libraries, headers, and \
documentation) for the KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "4fc2f5dd0c3fdbe931207522968de2a5171429faef8d2f06cb896c22b0276ad1a1300459a7995162cb5717253cea77868368be4c3e80f94ac418e58376edc6c2"

RPROVIDES:${PN} += "kim-api kim-api(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkim-api.so.2()(64bit) libkim-api2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
