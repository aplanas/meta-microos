SUMMARY = "Icinga Web 2 vendor library Parsedown"
DESCRIPTION = "Icinga Web 2 vendor library Parsedown."
LICENSE = "MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-Parsedown-2.11.4-1.1.noarch.rpm"
RPM_HASH = "35de823c5bdf414987088f902c303ecb5dabb628384c277828295aed1de3cd552ed8583517cd32078eccf9ed85ea27bb236073b291b6993f64057c99a4077451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-Parsedown"
RDEPENDS:${PN} += "icingaweb2-common php"

inherit rpm
