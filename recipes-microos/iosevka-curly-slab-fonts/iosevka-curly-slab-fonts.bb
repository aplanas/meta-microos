SUMMARY = "Iosevka in monospace slab-serif curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly Slab typeface (curly style, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-curly-slab-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "6cbf8ab916ac68460ae93c1e8661ae9ad71cde831fd008885d42487c7e74542d3cbed697ac84859440876ba2835c2005243dac36f0e5be87f2a74691432ef032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-slab-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
