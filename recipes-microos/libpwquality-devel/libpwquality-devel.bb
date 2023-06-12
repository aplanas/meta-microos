SUMMARY = "Development files for libpwquality, a library for password quality checking"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package provides files needed for development of applications \
using the libpwquality library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-devel-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "9801b50bac627798d7f87077618efa9f6d6e04285db54037dffd521caadd71cfc160d71ec8b4b3e23c4011b6810c55d8cf971b597e6b47d332b769c7a16038dd"

RPROVIDES:${PN} += "libpwquality-devel \
libpwquality-devel(aarch-64) \
pkgconfig(pwquality)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpwquality1 \
pkgconfig"

inherit rpm
