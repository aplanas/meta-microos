SUMMARY = "[validation] extra for python311-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python311-pytoolconfig-validation-1.2.4-1.4.noarch.rpm"
RPM_HASH = "8129e6886cfdfb10a3e078b839911b1e92f44462acababbd8edc9b49dccf1a901e4abca2479b47114f04142b23afa3c232c353fc9968846c8fdaf73d3528b5b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pytoolconfig-validation"
RDEPENDS:${PN} += "python311-pydantic python311-pytoolconfig"

inherit rpm
