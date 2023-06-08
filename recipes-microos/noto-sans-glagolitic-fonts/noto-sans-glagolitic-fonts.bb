SUMMARY = "Noto Glagolitic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Glagolitic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-glagolitic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "002b04cb2432b5ac5f74fb83df1e1f105402ad3024691177234baaa888327d130567812ac41220f0af59837cfa440125ab265d546c3968a4729085044b1005b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-glagolitic noto-sans-glagolitic-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
