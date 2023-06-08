SUMMARY = "Development headers for Boost.Nowide libraries"
DESCRIPTION = "Development headers for Boost.Nowide* boost libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_nowide1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "11cf854247e3c26bd646330a55240b3f014fea8c829d825c24e7cb51f497a2626815e22849dbd93a9b84c1c880f774e63e55fffa6e1b4754c9c305d335c68f93"

RPROVIDES:${PN} += "boost-nowide-devel-impl libboost_nowide1_82_0-devel libboost_nowide1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_nowide1_82_0"

inherit rpm
