SUMMARY = "Documentation for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Documentation for Highway development."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "highway-devel-doc-1.0.4-1.2.noarch.rpm"
RPM_HASH = "5a899ca41f742141f5ef1c92500a9e0e75fd24aae61c989e1b09d0edd1332f8dc5f187376866feba506271412ba854fbea5724946a5345ee251999532586e7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highway-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
