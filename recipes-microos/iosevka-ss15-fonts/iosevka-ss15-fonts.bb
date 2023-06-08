SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss15-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "1b785b8ea1c6607b9e7eda456651303139804817c22459fcbb13880aec4462775c9cf7ef02d35fac0a78f97344484f0c1ecc7d3c94ab3817e120c458f0d9320b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
