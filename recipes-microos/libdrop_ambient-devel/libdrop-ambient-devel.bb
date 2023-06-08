SUMMARY = "Devel package for libdrop_ambient0"
DESCRIPTION = "This package contains the files needed for developing \
applications that need to use the libdrop_ambient library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libdrop_ambient-devel-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "00adfd35e067ee2bf5f8795d2168dc3233e627283ef9b4e3bce16347bab979100862e974d291fe16f5ea6ea9e4793265fada1a4b493fa03104a53aa3ab15db45"

RPROVIDES:${PN} += "libdrop_ambient-devel libdrop_ambient-devel(aarch-64)"
RDEPENDS:${PN} += "libdrop_ambient0"

inherit rpm
