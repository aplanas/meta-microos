SUMMARY = "Intelligent predictive text entry platform (data files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the sample statistical data files and abbreviation files needed by presage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-data-0.9.1-12.10.aarch64.rpm"
RPM_HASH = "920d970a493f00be7d4e94cc1c6f1a1e3648c683f79db4dc39eefdcbcf139fc942879abab221a97bb03548ce01454ad661ad7e18f69855728f118760b2958412"

RPROVIDES:${PN} += "config(presage-data) libpresage-data presage-data presage-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
