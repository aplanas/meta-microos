SUMMARY = "Common files for Icinga Web 2 and the Icinga CLI"
DESCRIPTION = "Common files for Icinga Web 2 and the Icinga CLI."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-common-2.11.4-1.1.noarch.rpm"
RPM_HASH = "8a1e73cef33d93b20ed268f4848e5d7acec45d4c9df92162c44e5854f40a803ee4b08c4d55405c18cd2c8e93319450e98c967d24db08998c8ab7bcacca5a91fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-common"
RDEPENDS:${PN} += "/bin/sh pwdutils system-user-wwwrun"

inherit rpm
