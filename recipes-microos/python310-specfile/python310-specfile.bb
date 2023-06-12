SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-specfile-0.18.0-1.1.noarch.rpm"
RPM_HASH = "66dbf38a111effb398228a4a0d1526beb20db9961fb1f6629debceceaaa46c278ce4d894d42f16d5331ec8aa3065d1683ceda4d172b40b03bfc8d40741011c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-specfile python3.10dist(specfile) python310-specfile python3dist(specfile)"
RDEPENDS:${PN} += "python(abi) python310-rpm"

inherit rpm
