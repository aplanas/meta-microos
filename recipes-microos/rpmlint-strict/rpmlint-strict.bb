SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230502.1ab1dde"

RPM_NAME = "rpmlint-strict-2.4.0+git20230502.1ab1dde-1.1.noarch.rpm"
RPM_HASH = "006906ede72716477164982c2761992b1d2c6d5415c1345f1a37e56a5492f409d1f825e250a5269092a45d5135a65003cb5eaad2b2c08b61261d37a0ed7fdb3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(rpmlint-strict) rpmlint-strict"
RDEPENDS:${PN} += ""

inherit rpm
