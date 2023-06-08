SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python311-pip-wheel-22.3.1-2.1.noarch.rpm"
RPM_HASH = "881fdc955742530edf79b51c28476530a6c42918656145ef33390a2a43c4cdcd996d158fb0b17c6e8d4633a46a075ae2fae12c1182d1d4e7f11195cafda536ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pip-wheel"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python311-setuptools python311-xml"

inherit rpm
