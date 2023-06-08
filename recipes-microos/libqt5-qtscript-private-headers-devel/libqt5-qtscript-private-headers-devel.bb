SUMMARY = "Non-ABI stable experimental API for the Qt5 Script library"
DESCRIPTION = "This package provides private headers of libqt5-qtscript that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.12"

RPM_NAME = "libqt5-qtscript-private-headers-devel-5.15.12-2.2.noarch.rpm"
RPM_HASH = "ff721e6bc7637b94141ec5e6ec1583e9811063c3069766ae002c41606700ddcc68006ba83db6098f1302dc80f842521c3dc417715bb63bf7ea129eada946e56f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Script-private-headers-devel libqt5-qtscript-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Widgets-private-headers-devel libqt5-qtscript-devel"

inherit rpm
