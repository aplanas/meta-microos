SUMMARY = "Noto Linear A Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LinearA Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lineara-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9a79a99bf7b1e69d9c3171f8d6af0bc2ed743d0341a1245f59d902a9c85bbb9dd4005b4d63fcc84c0e99dc40888476aca2aa4986ea99344be0a33c8d52004f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lineara noto-sans-lineara-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
