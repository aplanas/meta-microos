SUMMARY = "SELinux policy core python utilities"
DESCRIPTION = "The policycoreutils-python-utils package contains the management tools \
use to manage an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-python-utils-3.5-2.1.noarch.rpm"
RPM_HASH = "97cdadc35bc48248318ad15d9b24eaf939567a62a2fdd7ee56a9e6936d379c9fa4fb4876382bec43277b1794a82ba40d6c786e8316ce2ed39137dafdf14dad3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python-utils"
RDEPENDS:${PN} += "/usr/bin/python3 python3-policycoreutils"

inherit rpm
