SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss15-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "f07ea387661daab03749a9e1ac8a0036c3e63f50e3c7fb6371f57aa1bb343baef17c31783a1844e4b67bbb5a8f2c142f36d93cd0abc4b63b498505da99f592ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
