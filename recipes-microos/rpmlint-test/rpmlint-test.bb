SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230502.1ab1dde"

RPM_NAME = "rpmlint-test-2.4.0+git20230502.1ab1dde-1.1.noarch.rpm"
RPM_HASH = "eb1e8364be7fa4650e44e2fed17efcb75fb58b362079b0b6f46ff6641b2e1b4b2955a03648d5c337839779beb092fa0d8d20930cd396f9400469a3fd068dae02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmlint-test"
RDEPENDS:${PN} += ""

inherit rpm
