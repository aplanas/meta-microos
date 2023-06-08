SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python310-pip-test-22.3.1-2.1.noarch.rpm"
RPM_HASH = "e24f7ef25aba0ae280bfe76bcc2290f2b118df58265777a806267665023a6280b8d64655d6afc4e5e587d52c831449545fe0744aa6de5fedcb484683f09fa2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-test python310-pip-test"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python310-setuptools python310-xml"

inherit rpm
