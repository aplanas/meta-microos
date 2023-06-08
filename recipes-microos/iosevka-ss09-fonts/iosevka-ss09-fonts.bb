SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss09-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "9bc5c4cbbdaeeea200b0d7000fa571f3860ef86a9fa4fb4e27b59a2a1ba71ff0f33976239d13043b45359943c799635f64c27c1c297e196d5f1378f2c78fea3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
