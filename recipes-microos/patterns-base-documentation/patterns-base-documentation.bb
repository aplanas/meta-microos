SUMMARY = "Help and Support Documentation"
DESCRIPTION = "Help and Support Documentation"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-documentation-20200505-40.1.aarch64.rpm"
RPM_HASH = "0f4c1f9ff1384d1942248f54cd34922f5ea4c4761cb20e8c186789e897d158fad10f9fd1c7193571efe420883fdb5339e3b5b895e2f1d44ce1c22c20574b2c22"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-documentation patterns-base-documentation(aarch-64) patterns-openSUSE-documentation"
RDEPENDS:${PN} += "man pattern()"

inherit rpm
