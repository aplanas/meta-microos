SUMMARY = "Fish Completion for swww"
DESCRIPTION = "Fish command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.2"

RPM_NAME = "swww-fish-completion-0.7.2-1.3.noarch.rpm"
RPM_HASH = "5d7cce7a8dd39e3fa3ca35ce4ca2bf29cf15db33a59a2dd59d11231ace54aa504f447b9fa1304c118f6d17497fcf5b5300967fdb56c0f69295cfcf58f9d7f9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
