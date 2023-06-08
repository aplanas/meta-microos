SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-aile-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "951cecdddbcc46976df8aec6c4a490742ee0c4814d39fb9effc81d5d4b30149dd73737c98868ec21524868a81d6b5eab5a310d65ad0de36301f0680b1e98ceb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
