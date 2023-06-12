SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-slab-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "03fa1544713391f91ba36e42df4d39290f00ddc1688395257e2762169597ff504048d62acc33c7245af0967f34e5deea29eebffc7b8aae6792181d904397e44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
