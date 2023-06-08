SUMMARY = "Noto Ol Chiki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OlChiki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-olchiki-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6d204918ccd9578c0f4bb2ee14e2df9b3470f169d6c3764481399edf32f2dfdaf2c1f0dc0e279c005586b3ec3632d8dd89f14690f63f39db2d08259d512c9d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-olchiki noto-sans-olchiki-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
