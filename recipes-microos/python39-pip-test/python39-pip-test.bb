SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python39-pip-test-22.3.1-2.1.noarch.rpm"
RPM_HASH = "b2c62f5327f86632cce3e09675c8968d2de2d7c6798f8f813c885610bfb1b131d7e952baed801c8ff45096976ed8b91f616674086e8c8bdf6fede758c1c23a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-test"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python39-setuptools python39-xml"

inherit rpm
