SUMMARY = "Development files for kpty, a pseudo terminal device interface"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kpty-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "44613653e896eb629358c1edb4cf1919c2049d2f8866358ca9a11073bc03ff7876ba8f98e5adb7e28d9ee95881a004621d44d09ba0e9aa83bf18ac9261129f2f"

RPROVIDES:${PN} += "cmake(KF5Pty) kpty-devel kpty-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(Qt5Core) extra-cmake-modules libKF5Pty5"

inherit rpm
