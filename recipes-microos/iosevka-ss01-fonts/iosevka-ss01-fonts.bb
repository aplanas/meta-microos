SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss01-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "7ac886f21fcfbb22fc87ee5d017fe1c591f3009bd6965bf163f2c18804976a5c4d871bc5f5b7a1c23e460fd724b60927393e1327a330b09cee0ba9674f306fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
