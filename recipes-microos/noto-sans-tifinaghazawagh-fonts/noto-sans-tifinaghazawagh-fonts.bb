SUMMARY = "Noto Tifinagh Azawagh Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAzawagh Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghazawagh-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "77a2fb13ec2d43ae9b27c74c12c7ed56f9c0c4d20d50d54c7a099090843bfcf3b0556e556e50fa593d940acf218c5b9dc68cd6dcf6f4cc2bb90aeb1d5f70019a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghazawagh \
noto-sans-tifinaghazawagh-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
