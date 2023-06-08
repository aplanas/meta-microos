SUMMARY = "Necessary packages for plasma-vault to support cryfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault cryfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "plasma-vault-backend-cryfs-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "f0b0375cb6c71ce3383a102c01870f9814f03b8f7884213d3ebf56690b6e43331a4dda7babc950d5fe4c7c9675037dbc0beaeb96578ff832ea6d3321a2ea93a3"

RPROVIDES:${PN} += "plasma-vault-backend plasma-vault-backend-cryfs plasma-vault-backend-cryfs(aarch-64)"
RDEPENDS:${PN} += "cryfs plasma-vault"

inherit rpm
