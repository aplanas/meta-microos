SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss16-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "878832426e95dde60af85d922a264e5891c90cb3b6dbb267d1c661563cd2967054d32fb2de259196d64262a4c486cd21d2c414587fdf4c5e6d7a8bdff3aed2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
