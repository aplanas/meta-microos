SUMMARY = "Development headers for Boost.Container"
DESCRIPTION = "Development header files and libraries for Boost.Container. \
Boost.Container library implements several well-known containers, \
including STL containers. The aim of the library is to offers advanced \
features not present in standard containers or to offer the latest \
standard draft features for compilers that don't comply with the latest \
C++ standard."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_container1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "cc89da27211f8a21f3abe240d20a71aec395f4f0227cb2ef2e2ded714c9f2c40d685571dbdd470fe629045bd21c420aba898ba9a08a07dfb1b04871ba67e9aaa"

RPROVIDES:${PN} += "libboost_container-devel-impl libboost_container1_82_0-devel libboost_container1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_container1_82_0 libboost_headers1_82_0-devel libstdc++-devel"

inherit rpm
