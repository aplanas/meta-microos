SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knotifyconfig-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "e0f7ac07409db907d3e349a4fbfa3968c67e3c5a99754004e5ec38cb7b0ae9f4b125098c8508f29e48caa604a0f244b2277413fd99395a0586b9908e91cdd574"

RPROVIDES:${PN} += "cmake(KF5NotifyConfig) knotifyconfig-devel knotifyconfig-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules libKF5NotifyConfig5"

inherit rpm
