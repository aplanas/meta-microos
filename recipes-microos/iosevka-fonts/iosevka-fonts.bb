SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "13a930f75a1c0dbc3d3b60d8443413610dc5ca98ab0c23cd86e7efeca14a3f719539caad93fe0dff229207faf3cd40c59eb497d7c66c527ed4a7f2aa8eeacff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
