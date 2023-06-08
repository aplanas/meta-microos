SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python310-pip-22.3.1-2.1.noarch.rpm"
RPM_HASH = "30603b60d69cff295fb8487f330ffec107885baeae50ea419bb77060e9ffb6c11bae7d7fcae9241201f293125700892d1c21f95487c0e7edc192b3a1326017f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip python3.10dist(pip) python310-pip python3dist(pip)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts ca-certificates coreutils python(abi) python310-setuptools python310-xml"

inherit rpm
