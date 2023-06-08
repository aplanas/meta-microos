SUMMARY = "Documentation for the libaom API"
DESCRIPTION = "This package contains the API documentation for libaom, a library \
for the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.0"

RPM_NAME = "libaom-devel-doc-3.6.0-2.1.noarch.rpm"
RPM_HASH = "663029300178e1ede0baad6ebb1573e6a2ea559db32607ac19628a03c2a5323d48bf26657bbea853140c5674c41988a0411d05b97f30b99b9039e19545488058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libaom-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
