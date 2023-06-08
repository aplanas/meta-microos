SUMMARY = "Development Files for workrave"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Workrave."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "workrave-devel-1.10.50-2.1.aarch64.rpm"
RPM_HASH = "3b6c30eb44db4775eb7fe9663b242356099c0d225b4d6c14fe8d406fb900ba111716d040adcfd2589692934936ce10cb93b3fd6629e0d73fe7ed20cf388529f0"

RPROVIDES:${PN} += "workrave-devel workrave-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
