SUMMARY = "Fish completion for you-get"
DESCRIPTION = "Fish command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-fish-completion-0.4.1650-1.2.noarch.rpm"
RPM_HASH = "6745354c1231b3477ba2c43aafda17d2f211ff4a7619e375e0a79f68ebe883250d35617c6eaf9dbdab8dc6c6b9e95cd2dfb5a03cdc9c4cb9b667c86d7c5335be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
