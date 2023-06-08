SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python310-pip-wheel-22.3.1-2.1.noarch.rpm"
RPM_HASH = "eeaf90d276196198338fe32b401b8aa47547913576b45224c82a78ef1aa460113e6c660fbcb42dbe3b6e64e482eef5ff97d79519999c1d543c88ff1c6f094e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-wheel python310-pip-wheel"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python310-setuptools python310-xml"

inherit rpm
