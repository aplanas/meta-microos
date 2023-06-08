SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss14-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "2a6939e2701fc007e0359e219fc2a6f2da153a737d5ac815a28a61471c58076b447ffee693fea5043a406213acac8ae84be946116e3396c1639970f51e9b71b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
