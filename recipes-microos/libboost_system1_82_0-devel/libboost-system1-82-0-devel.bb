SUMMARY = "Development headers for Boost.System library"
DESCRIPTION = "This package contained Boost.System development library. It is no \
longer required as the library is headers only."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_system1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "9cff70193e0792fbf396e41747049dfc692d2fc9204ef74ff867824d22f101ccae19bc1a7a4091b5c94b14b95500f5f06732c777812f9294b2bc086610247927"

RPROVIDES:${PN} += "libboost_system-devel-impl libboost_system1_82_0-devel libboost_system1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_system1_82_0"

inherit rpm
