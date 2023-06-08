SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kauth-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "1bee05f21762cdd65f0d6fd5ec7288a040a57a48c65aba5f1902bcc04416ae7625fed44572414f0c0f72170f568f6cff8aa51730575285b17eecbe4affb29d56"

RPROVIDES:${PN} += "cmake(KF5Auth) kauth-devel kauth-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) extra-cmake-modules libKF5Auth5"

inherit rpm
