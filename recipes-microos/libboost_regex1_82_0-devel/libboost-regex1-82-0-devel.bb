SUMMARY = "Development headers for Boost.Regex library"
DESCRIPTION = "This package contains development headers for Boost.Regex library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_regex1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "6ed459bb787f2dc6f359441c3bcdceb9515a41080f17595d87445801aa43a3f3426354e301f9991281221c8b8a47176125bc138cf1f2ea714be29484c3b158ee"

RPROVIDES:${PN} += "libboost_regex-devel-impl libboost_regex1_82_0-devel libboost_regex1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_regex1_82_0 libicu-devel"

inherit rpm
