SUMMARY = "Web based remote system managemet"
DESCRIPTION = "Packages required to run the Cockpit system management service. \
For the web service the cockpit-ws container is required."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cockpit-5.0-69.1.aarch64.rpm"
RPM_HASH = "f6f5286ddc9207dfd18b5b22857714ff51926e7b9f0e04658fa25c71509d8902aba18437662a3d20b39a8ac53c3717dea6dfe9f0537289265d998ee987044ba4"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-cockpit patterns-microos-cockpit(aarch-64)"
RDEPENDS:${PN} += "(cockpit-packagekit if patterns-microos-base-packagekit) cockpit-podman cockpit-system"

inherit rpm
