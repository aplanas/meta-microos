SUMMARY = "Framework for collecting feedback from application users"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. It is designed to be compliant with the \
KDE Telemetry Policy, which forbids the usage of unique identification."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libKUserFeedbackCore1-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "46570fe2023fc6cabd62b1f59aa30f3b1c2fcde9d4206ed67625c80200112ecf7a366302c7a0359c81981ee8bbe9bec851e64308300fcd6d374498e398c38bcf"

RPROVIDES:${PN} += "kuserfeedback libKUserFeedbackCore.so.1()(64bit) libKUserFeedbackCore1 libKUserFeedbackCore1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
