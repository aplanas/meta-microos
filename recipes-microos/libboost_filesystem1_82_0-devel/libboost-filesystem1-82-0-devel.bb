SUMMARY = "Development headers for Boost.Filesystem library"
DESCRIPTION = "Development headers for Boost.Filesystem library, a library providing \
facilities to manipulate files and directories, and the paths that \
identify them."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_filesystem1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "4a95119a1e746e007f4041f7d07c59b2102e38f1709892bd943411af8ebe82a99420fb412792d168ae572f1f36d326d1296bf0bb56627e1ac3fa9dd5e9daad92"

RPROVIDES:${PN} += "libboost_filesystem-devel-impl libboost_filesystem1_82_0-devel libboost_filesystem1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_atomic1_82_0-devel libboost_filesystem1_82_0 libboost_headers1_82_0-devel libstdc++-devel"

inherit rpm
