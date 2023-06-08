SUMMARY = "Development files for tukit library"
DESCRIPTION = "This package contains the files required to develop programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.5"

RPM_NAME = "libtukit-devel-4.1.5-1.1.aarch64.rpm"
RPM_HASH = "c39732663cec3dc0e3394c52cc977bfdf528c501e1e44c0b3a32e4fecb8e0b6bd1b94878517475a2263bf96bbd4a4846f97d919945631b01a53edead7a83fefd"

RPROVIDES:${PN} += "libtukit-devel libtukit-devel(aarch-64) pkgconfig(tukit) tukit-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtukit4 pkgconfig(libeconf) pkgconfig(mount) pkgconfig(rpm)"

inherit rpm
