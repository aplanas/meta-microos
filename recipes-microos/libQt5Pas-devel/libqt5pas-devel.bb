SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "Development files for Free Pascal interface to Qt5."
LICENSE = "LGPL-3.0-only"

PV = "2.2.6"

RPM_NAME = "libQt5Pas-devel-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "56320dc3e7d335a607861520b3015a4833ab7ac6ebd69dc4119452f2ba90f47ea439287cd3cf660e86a208fb0e75d4b0f033a9bde560e3454814db9a0c0c45c6"

RPROVIDES:${PN} += "libQt5Pas-devel libQt5Pas-devel(aarch-64)"
RDEPENDS:${PN} += "libQt5Pas1"

inherit rpm
