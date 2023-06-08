SUMMARY = "Doulos SIL Fonts Similar to Times"
DESCRIPTION = "Doulos SIL provides glyphs for a wide range of Latin and Cyrillic \
characters. Doulos's design is similar to the design of the Times-like \
fonts, but only has a single regular face. It is intended for use alongside \
other Times-like fonts where a range of styles (italic, bold) are not \
needed."
LICENSE = "OFL-1.1"

PV = "6.101"

RPM_NAME = "sil-doulos-fonts-6.101-1.4.noarch.rpm"
RPM_HASH = "e33088ed8253da6060ce6286909d71099c42ba49aba2f45acbcc9b443ed9fe980c486e8b46d332a57e2d5e222a5f4a6388b46850caee21224de5115fb178608f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-doulos sil-doulos-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
