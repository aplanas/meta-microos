SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcrash-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ad51def68fe58b4226fffe86a722baf269ae198fc44b11d49a391d302416505a572eff21be524053423c9aac09ed466958f08b30a89d94fde2444911ba6c0443"

RPROVIDES:${PN} += "cmake(KF5Crash) kcrash-devel kcrash-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5Crash5"

inherit rpm
