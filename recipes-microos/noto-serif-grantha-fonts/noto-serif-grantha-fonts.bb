SUMMARY = "Noto Grantha Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Grantha Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-grantha-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "075cc0ad00d8e367661f198ed892f4179d61736955c6b8c5a08977558ff100f58932ddb36d44c8a6aa24969d23121886b6668b994b1bf5b4e0506eb0ff343a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-grantha \
noto-serif-grantha-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
