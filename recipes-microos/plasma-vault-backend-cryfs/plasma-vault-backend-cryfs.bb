SUMMARY = "Necessary packages for plasma-vault to support cryfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault cryfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma-vault-backend-cryfs-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "34c8c972128275dae1385d2c40b0b5af7d979c80a50ee3b8580cc4491b2443527c7992cbf292b9daacb629dd5bab35c41e14498cc5aedacac65a1967c36e9b3d"

RPROVIDES:${PN} += "plasma-vault-backend plasma-vault-backend-cryfs plasma-vault-backend-cryfs(aarch-64)"
RDEPENDS:${PN} += "cryfs plasma-vault"

inherit rpm
