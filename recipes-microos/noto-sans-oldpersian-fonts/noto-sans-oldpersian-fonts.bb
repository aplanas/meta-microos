SUMMARY = "Noto Old Persian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldPersian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldpersian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f6caf2b1d90384a84fd16fbcfaf56ed62c1289af536c2f62703861bdc0b7e70203d83952c15a3d6a7a30d31f67920ed09e0cf7ccbdc886b3e942e9429ae0c83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldpersian \
noto-sans-oldpersian-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
