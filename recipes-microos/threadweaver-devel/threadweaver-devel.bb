SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "ThreadWeaver is a helper for multithreaded programming.  It uses a job-based \
interface to queue tasks and execute them in an efficient way. \
 \
You simply divide the workload into jobs, state the dependencies between the jobs \
and ThreadWeaver will work out the most efficient way of dividing the work between \
threads within a set of resource limits. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "threadweaver-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "29c73857c8539a9b8c1262a298bc36902fc0710f392f166c141a13ac40deff1d750fe4eff79692f92287e646c6b4c7fc1f4880de17e1cd46a7e541010d7a8fb4"

RPROVIDES:${PN} += "cmake(KF5ThreadWeaver) threadweaver-devel threadweaver-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5ThreadWeaver5"

inherit rpm
