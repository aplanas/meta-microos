SUMMARY = "Development headers for Boost.Math libraries"
DESCRIPTION = "Development headers for Boost.Math* boost libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_math1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "aa472852065edc1e78d1cfa69adb44622f76dc7fc83bc6d90767609f0d12dce908d65be191f6c4879684dd52658d0ba171dbb10a2f0af12648586f4aa5959223"

RPROVIDES:${PN} += "libboost_math-devel-impl libboost_math1_82_0-devel libboost_math1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_math1_82_0"

inherit rpm
