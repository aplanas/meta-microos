SUMMARY = "Noto Indic Siyaq Numbers Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
IndicSiyaqNumbers Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-indicsiyaqnumbers-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e9e507af7d2c4bc7d1c6df66cbec324d01eb86872548f5f57c24dc198ba9b5e5183bbd26cc4069bb5b917716c66bd24f200d7761c4aa14d482401ebe5125b389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-indicsiyaqnumbers \
noto-sans-indicsiyaqnumbers-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
