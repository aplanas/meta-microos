SUMMARY = "Documentation for qt6-location in QCH format"
DESCRIPTION = "This package contains documentation for qt6-location in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "5beeabea8f151efd631e0b6e890f922540144c581310033ef936b10bc183eeeeee11102f34c97b461c43e74da512d70e9a8c279c49b03055a1162c17f8f215ca"

RPROVIDES:${PN} += "qt6-location-docs-qch \
qt6-location-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
