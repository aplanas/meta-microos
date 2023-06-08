SUMMARY = "User guide for the MATE desktop"
DESCRIPTION = "This package contains documentation targeted for end-users of \
MATE Desktop Environment with general MATE applicability."
LICENSE = "GFDL-1.1-or-later"

PV = "1.26.0"

RPM_NAME = "mate-user-guide-1.26.0-1.6.noarch.rpm"
RPM_HASH = "062ecefa9c5ab51f1df8e882c019db159313c87c0a9c1d64dcec35dde066806b5eb886de7416b6f865667e8e675602d780398706103faeb4846aad35a32a2a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(mate-user-guide.desktop) mate-user-guide"
RDEPENDS:${PN} += "yelp"

inherit rpm
