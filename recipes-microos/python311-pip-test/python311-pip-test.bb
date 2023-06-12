SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python311-pip-test-23.1.2-1.1.noarch.rpm"
RPM_HASH = "b8e6aa93ca2ed290a4bf8ed724b20bfd89277cf5afea688a1af9a8c34a60c347452053551e6a72178567ac537df85d558043b9c9c8b0d6dfb74ec1cdf0e69030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pip-test"
RDEPENDS:${PN} += "/bin/sh \
alts \
ca-certificates \
coreutils \
python311-setuptools \
python311-xml"

inherit rpm
