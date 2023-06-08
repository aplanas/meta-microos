SUMMARY = "LXC container runtime library development files"
DESCRIPTION = "This package provides the LXC container runtime library development files."
LICENSE = "LGPL-2.1-only"

PV = "5.0.1"

RPM_NAME = "liblxc-devel-5.0.1-2.3.aarch64.rpm"
RPM_HASH = "125457a182f176c0d4e00884a7896d35efdbaeb34a441bd4946cc364d5c9b4d88694282c1786e6382d8b010aeb322e6e638f3fca56e95fe95929cc7fa0847788"

RPROVIDES:${PN} += "liblxc-devel liblxc-devel(aarch-64) pkgconfig(lxc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblxc1 pkgconfig(libcap) pkgconfig(libseccomp) pkgconfig(libselinux)"

inherit rpm
