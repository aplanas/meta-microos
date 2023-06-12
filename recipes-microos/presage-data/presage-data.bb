SUMMARY = "Intelligent predictive text entry platform (data files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the sample statistical data files and abbreviation files needed by presage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-data-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "0c25fcbc23fa17e1e75cea1ede303aabe2be04a6beceeeaae9d89f309893c32271eecf91d981704a9ba6f3cd90861824d8944c594e8a3d937aaa1c6b6b28fe60"

RPROVIDES:${PN} += "config(presage-data) libpresage-data presage-data presage-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
