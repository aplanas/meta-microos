SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss13-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "02c7d4a3b347bfeb64203d0bdeabbbc5c1e10f2e25ddb0187fee8b31eb28b21a2b9a6996773697824099d29a5512203e7512aeace7e8a99bcc17db2a13b70b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
