SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kded-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "4ea7a4a7703ea03c14b909e63b793863164104e517ccab81ab3cedcee51b38c08567e5ce18f72edd514f172d00510ce7f02f89e380c499274a12eab9c9e65965"

RPROVIDES:${PN} += "cmake(KDED) \
kded-devel \
kded-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules \
kded"

inherit rpm
