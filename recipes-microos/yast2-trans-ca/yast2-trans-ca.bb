SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ca-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "e7a7e0e354ab301ae0c4561131e32ba0f106de3266cc6fae2ebadfc57a626292f87c1d9b579a57c77eea913769925831336e47fc2bd3e16eb74e02c80c7f996f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ca) yast2-trans-ca"
RDEPENDS:${PN} += ""

inherit rpm
