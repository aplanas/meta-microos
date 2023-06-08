SUMMARY = "Iosevka in monospace, Monaco style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS07 typeface (monospace, Monaco style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss07-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "f0f7ecb00097f9219fd8c3437c08f141f00fea7b852b6d01d200e5582c63e1ac3116e487d4d69da9aa3cdc9567aee97317f9a475422b20bfc9574d67430e3677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss07-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
