SUMMARY = "Fish Completion for kubernetes1.24-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.24-client."
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-client-fish-completion-1.24.13-2.2.noarch.rpm"
RPM_HASH = "0dd0cad01b34a6126bacd3c8db30c5b9d1950b39fdd1f04f6d3517d7d597b52c3b4ca2340850d2c558daae5e12fdd973a838958ea201ef3fff0db4db219dd5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion kubernetes1.24-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.24-client"

inherit rpm
