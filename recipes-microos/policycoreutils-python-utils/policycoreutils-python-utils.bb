SUMMARY = "SELinux policy core python utilities"
DESCRIPTION = "The policycoreutils-python-utils package contains the management tools \
use to manage an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-python-utils-3.5-1.4.noarch.rpm"
RPM_HASH = "7699f41700e48bdce1db0a18be7bcb2e4c1b8ddee853b6c81952854ffd001597d079197f3fa09af7215e729b7768c3b2263c06d39d79f3b00a16d932c63adeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python-utils"
RDEPENDS:${PN} += "/usr/bin/python3 python3-policycoreutils"

inherit rpm
