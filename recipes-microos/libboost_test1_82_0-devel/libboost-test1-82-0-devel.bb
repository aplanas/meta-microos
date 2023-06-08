SUMMARY = "Development headers for Boost.Test library"
DESCRIPTION = "Development headers for Boost.Test library. Boost.Test supports for \
simple program testing, full unit testing, and for program execution \
monitoring."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_test1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "097e66eb1060bbca6fcdee94b0109f3b9c741c7e7c39c61979155e2b50b16916dbeb3e098782bce862b2b54cf5c32fb0770ff6c36b42ae3478112047916a98c0"

RPROVIDES:${PN} += "libboost_test-devel-impl libboost_test1_82_0-devel libboost_test1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_test1_82_0"

inherit rpm
