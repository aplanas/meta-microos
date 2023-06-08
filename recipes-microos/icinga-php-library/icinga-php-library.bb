SUMMARY = "Icinga PHP Library for Icinga Web 2"
DESCRIPTION = "This project bundles all Icinga PHP libraries into one \
piece and can be integrated as library into Icinga Web 2."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "icinga-php-library-0.10.0-1.2.noarch.rpm"
RPM_HASH = "c07b8159a6a20d5752a165ffcd85cfcac9604171d41ac33b877a7ca2ade1617106bd078937a39afbe692d7c27ebbf1ebe9d57416ad61bcb1b1e59fa4367c0d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-library"
RDEPENDS:${PN} += "icinga-php-common"

inherit rpm
