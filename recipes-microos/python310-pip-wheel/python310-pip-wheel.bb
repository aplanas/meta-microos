SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python310-pip-wheel-23.1.2-1.1.noarch.rpm"
RPM_HASH = "e6d3c909aeea947233498f87c72715cd5d09b18d0f4318ab76f2994e80993e446fb283013af6c1e0ede1cecbb60e522bbc6fed9bd6d05a7292c83618f6cbc4cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-wheel \
python310-pip-wheel"
RDEPENDS:${PN} += "/bin/sh \
alts \
ca-certificates \
coreutils \
python310-setuptools \
python310-xml"

inherit rpm
