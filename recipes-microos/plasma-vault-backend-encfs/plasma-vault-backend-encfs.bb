SUMMARY = "Necessary packages for plasma-vault to support encfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault encfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "plasma-vault-backend-encfs-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "6fa91f056032a6630786684a010bbbbd10f0ff87a7f86ec8abdeeec8e97bdcddb35f086cdab7edeb9e638490e4b0200aa945c3c41950aa6b98729d5b37ba5f17"

RPROVIDES:${PN} += "plasma-vault-backend plasma-vault-backend-encfs plasma-vault-backend-encfs(aarch-64)"
RDEPENDS:${PN} += "encfs plasma-vault"

inherit rpm
