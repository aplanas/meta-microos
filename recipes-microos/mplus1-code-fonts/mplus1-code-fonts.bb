SUMMARY = "Non-variable M PLUS 1 Code font"
DESCRIPTION = "7 weights from Thin to Bold. A monospaced font combining \
full-width Japanese glyphs (shared with M PLUS 1) and half-width \
alphanumeric glyphs (shared with M PLUS Code Latin 50 described below)."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus1-code-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "54c3c4a0414d0017076ba752accf8c905158d4d45dc6cfa951c243e1671c2919473b70921c82f3a48785019915d72441d1e270c5fa8a6342f82c5e826305934c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-code-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
