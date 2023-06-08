SUMMARY = "Noto Soyombo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Soyombo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-soyombo-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f371505d9e1a5aa213bd6f0f61726bde88c3446ec2fae2ed08507bb3071a38ff358c740c0a124ad66a590e7172e467a8fb8382db8fd8428f9676e7135a98eecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-soyombo noto-sans-soyombo-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
