SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdesu-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "289b5531f6638aa12074ba04b620efc8b392a377724a24ce485deb031bc17d5d5564cbb3b8d4bd7473ab656d0dc27dadc95738ec3006ce239dd2cc0c0a671318"

RPROVIDES:${PN} += "cmake(KF5Su) kdesu-devel kdesu-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Pty) cmake(KF5Service) extra-cmake-modules libKF5Su5"

inherit rpm
