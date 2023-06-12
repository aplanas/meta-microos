SUMMARY = "The login.defs configuration file"
DESCRIPTION = "This package contains the default login.defs configuration file \
as used by util-linux, pam and shadow."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "login_defs-4.13-6.1.noarch.rpm"
RPM_HASH = "23e68415e2fe0cee2971122e84b20465ae1d56ccdfba13892efabc2b9c87d2a493001f50b67f7b31abb8eb4fca5917fea874f84975068aaddd99d9718b50bd6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "login_defs \
login_defs-support-for-pam \
login_defs-support-for-util-linux"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
