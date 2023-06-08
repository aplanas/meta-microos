SUMMARY = "Zig Standard Library"
DESCRIPTION = "zig Standard Library"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "zig-libs-0.10.1-2.3.noarch.rpm"
RPM_HASH = "1f6fffd454e2dab0ac445313f3080f16484a765c60033e7b22c5a47480c806998d642565e2175c9d47f43b210af63c39014ecb102027c9aea874d685ff775a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zig-libs"
RDEPENDS:${PN} += ""

inherit rpm
