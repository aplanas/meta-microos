SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-test-2.4.0+git20230602.89901a92-1.1.noarch.rpm"
RPM_HASH = "2769a65d0c3a55a4afe81bab45541f0c110a0514c3363226cada7871b70bd90db0a9e5cdcf3a9f997a601bb0fc233549975497745e3805741f00c29f3986490c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmlint-test"
RDEPENDS:${PN} += ""

inherit rpm
