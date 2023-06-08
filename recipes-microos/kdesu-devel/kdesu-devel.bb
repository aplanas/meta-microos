SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdesu-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "4dcf9c8585965a56a39f0a94c96dd4792ed37fc3d5a3a1cfe02d6b58c5529f952f0d7e15fe7031314e9b57b0088a1de26e4d664d742cdfefb6a750817b30b6bd"

RPROVIDES:${PN} += "cmake(KF5Su) kdesu-devel kdesu-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Pty) cmake(KF5Service) extra-cmake-modules libKF5Su5"

inherit rpm
