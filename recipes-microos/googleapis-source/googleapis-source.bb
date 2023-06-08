SUMMARY = "Source code of googleapis"
DESCRIPTION = "Googleapis are the interface definitions of public Google APIs that support \
both REST and gRPC protocols. \
 \
This package contains source code for googleapis."
LICENSE = "Apache-2.0"

PV = "20190724"

RPM_NAME = "googleapis-source-20190724-1.10.noarch.rpm"
RPM_HASH = "bc923643c956cf0abf2ed80624cc53d6dd6d819d2db7e4f00c617a37c2214e256610d3d8d8cbd9a2d622e2c69ff6a1ac817cb027e8c7197ca37736dd0ae33457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "googleapis-source"
RDEPENDS:${PN} += ""

inherit rpm
