SUMMARY = "[global] extra for python310-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python310-pytoolconfig-global-1.2.4-1.4.noarch.rpm"
RPM_HASH = "f8950a56e1108b44040e1cce87d97c04a7dd6b576906e1c2d7a394693f93c239546eb52ec6c9dc396b47ef8064ac6b5ea237e26fc7a69c383a0e68a91015174c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig-global python310-pytoolconfig-global"
RDEPENDS:${PN} += "python310-platformdirs python310-pytoolconfig"

inherit rpm
