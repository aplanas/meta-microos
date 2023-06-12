SUMMARY = "Libraries and Header Files to Develop Programs with iLBC Support"
DESCRIPTION = "Libraries and Header Files to Develop Programs with iLBC Support"
LICENSE = "GPL-2.0+"

PV = "3951"

RPM_NAME = "ilbc-devel-3951-122.30.aarch64.rpm"
RPM_HASH = "ba587ed35049a2fff42a83045929318d5af40b4fa1c75e5a655ba6a77a039837afcb77ba486ecbf11c43b7aa66934d3c5203dfc721517df54208977b6cf9e2f2"

RPROVIDES:${PN} += "ilbc-devel \
ilbc-devel(aarch-64)"
RDEPENDS:${PN} += "libilbc0"

inherit rpm
