SUMMARY = "Intelligent predictive text entry platform (development files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains development files. \
 \
This package contains the header files needed to compile applications or shared objects that use libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-devel-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "4e3630598220af6d2c2f71bde4efe34270e618eadf4328d848f749b9b88edee609fbb9b27b56bc38e9b2a791563ee6041687afa14301d355e0114b76a46d7ea7"

RPROVIDES:${PN} += "libpresage-devel libpresage-devel(aarch-64)"
RDEPENDS:${PN} += "libpresage1"

inherit rpm
