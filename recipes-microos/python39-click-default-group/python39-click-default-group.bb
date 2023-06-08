SUMMARY = "Extends clickGroup to invoke a command without explicit subcommand name"
DESCRIPTION = "Extends click.Group to invoke a command without explicit subcommand name."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "python39-click-default-group-1.2.2-2.8.noarch.rpm"
RPM_HASH = "8b3c1251efc009ca10c08ac6a9a5b8f4a5466ffaa33243c0c0800b164ac40e437b38af2c4867d9fba4d0a61ca6d2c1cd1c120bb67415dad3fa43bac45d6d8839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-default-group) python39-click-default-group python3dist(click-default-group)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
