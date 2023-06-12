SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-pip-test-23.1.2-1.1.noarch.rpm"
RPM_HASH = "ef97b491020c1b0663d36b19d04452e6ee6edd8e2d6a5deb3b3952b4893d72306b461e0d6259919acc29e2cf54961798f61bf153bcb7099a15b9829d5c49ab02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pip-test"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python39-setuptools python39-xml"

inherit rpm
