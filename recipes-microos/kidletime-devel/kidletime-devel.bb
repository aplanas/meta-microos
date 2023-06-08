SUMMARY = "Build environment for kidletime, an idle time singleton"
DESCRIPTION = "Development files for KIdleTime, which is a singleton reporting \
information on idle time. It is useful not only for finding out about \
the current idle time of the PC, but also for getting notified upon \
idle time events, such as custom timeouts, or user activity."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kidletime-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "9d60bf3e10c35ba2a7673acf5b740dd0da4ec04f94ed90fb54704c1d46ae30ab5fb95bb004c6c43b626ef7fcde6cac8b33de51b0895c4a8cdff311ccfd31a02f"

RPROVIDES:${PN} += "cmake(KF5IdleTime) kidletime-devel kidletime-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5IdleTime5"

inherit rpm
