SUMMARY = "User guide for the MATE desktop"
DESCRIPTION = "This package contains documentation targeted for end-users of \
MATE Desktop Environment with general MATE applicability."
LICENSE = "GFDL-1.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-user-guide-1.26.1-1.1.noarch.rpm"
RPM_HASH = "5c54fd0c9d9f23666b6788036c506c55089a58c120c3f2c086ac9380a71fe7bc724a0f5565c4b84a7b9ff41e2b85a4028c415990632fceb9f395790fb1804f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(mate-user-guide.desktop) mate-user-guide"
RDEPENDS:${PN} += "yelp"

inherit rpm
