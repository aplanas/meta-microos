SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knotifyconfig-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "5225f9282b1ea105816b91f881e94f6e4b4a8c9745c30ee176816a19b194cb0f3158a62cf6806501ef79543870a0e63c77b62b18baa7a6679829bac60ae54d25"

RPROVIDES:${PN} += "cmake(KF5NotifyConfig) knotifyconfig-devel knotifyconfig-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules libKF5NotifyConfig5"

inherit rpm
