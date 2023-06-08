SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "22.3.1"

RPM_NAME = "python311-pip-test-22.3.1-2.1.noarch.rpm"
RPM_HASH = "a7fafe45c6a1ea47af17fc4527f99099c018e945cff63d90e43323a888b38bbd6f04e0846ad8b3aeb1ae02f18cb5616495c351ab8a33745e05414466e4e2ed2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pip-test"
RDEPENDS:${PN} += "/bin/sh alts ca-certificates coreutils python311-setuptools python311-xml"

inherit rpm
