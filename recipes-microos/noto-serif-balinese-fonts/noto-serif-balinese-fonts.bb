SUMMARY = "Noto Balinese Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Balinese Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-balinese-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "3c9a2a7813df3574a85765ca1d2b9caf3db8f456f8b8da4636d53226aada6c090ae6593d948bda02290142da05df72a2519f49788c4b2650d3321797e549c92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-balinese noto-serif-balinese-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
