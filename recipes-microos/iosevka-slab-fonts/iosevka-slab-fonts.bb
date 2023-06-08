SUMMARY = "Iosevka in monospace slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Slab typeface (monospace, slab-serif)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-slab-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "4c261cad61436c0d5b0f7ae98f2314277f9ce385ab60c1a317b021a7d5aace0d712792fb2dd9971253c68ba94285f17a9897466c2a2921f279be3150aae0964f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-slab-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
