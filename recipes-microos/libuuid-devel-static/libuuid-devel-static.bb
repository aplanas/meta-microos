SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "libuuid-devel-static-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "897efe1a63b289951c798cca53247851a02310588034d8b532d1a44d7fda7a1deb5e3b419d902212712855cf94d08c56dbb3dcd3629532d31cde49c9ff66c644"

RPROVIDES:${PN} += "libuuid-devel-static libuuid-devel-static(aarch-64)"
RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
