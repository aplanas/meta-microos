SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python39-pip-22.3.1-2.1.noarch.rpm"
RPM_HASH = "19755b4fc39fa3b165d3e1ae34a87b96b14a86d1bc7f0d7f82e694eb933dc431cd1e2877fa0ecb19633f39d269c604a82b1b3a483b9b60f744f5196c4748357d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip) python39-pip python3dist(pip)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts ca-certificates coreutils python(abi) python39-setuptools python39-xml"

inherit rpm
