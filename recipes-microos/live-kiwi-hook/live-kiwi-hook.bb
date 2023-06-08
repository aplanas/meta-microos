SUMMARY = "KIWI Hook for Checking and Renaming the Live Images"
DESCRIPTION = "This package contains a script that is run after building the Live Images with KIWI."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "live-kiwi-hook-1.0-3.9.noarch.rpm"
RPM_HASH = "686ac00bfa7346b6330c756bdfe53074d66527fa504fcb550175b97a7fddb06c30710d58b886cceea0eebd30761daddb8fe62cdbb6cd8bc03c5edd01323fe000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiwi_post_run live-kiwi-hook"
RDEPENDS:${PN} += "/bin/sh coreutils sed util-linux"

inherit rpm
