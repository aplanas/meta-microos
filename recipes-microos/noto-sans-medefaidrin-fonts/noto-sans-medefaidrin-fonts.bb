SUMMARY = "Noto Medefaidrin Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medefaidrin Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-medefaidrin-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "aecb1391e155027fb23d636887c9bf2ef53701378f35235a1327b98fd6c7110dce4af3cce01f409269992131db8ad18768bc674ec6af8df310e128f18bfee41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-medefaidrin noto-sans-medefaidrin-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
