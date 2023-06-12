SUMMARY = "Variable M PLUS 1 Sans Serif font"
DESCRIPTION = "M PLUS 1 is a Sans Serif variable font, supporting GF Latin Plus \
glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus1-variable-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "8eaa92c7ffc2e083acc9711a324c13f18a17533eb18c3414f43d61aaf04a55abe0253add5782669a6149998c18c336e09a5065afdc7983631010c89de75315be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-variable-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
