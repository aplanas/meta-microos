SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-curly-slab-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "5e81018761306887beae3c023dd78645f71bb7dd59ddb6fa5f6391123cb04f0898d50d9420d66fc433fd7c1a29b0ef648a353e2552b99b484d761fbbe66ea0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
