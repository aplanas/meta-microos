SUMMARY = "Scripts to convert xml to man pages or html"
DESCRIPTION = "xmltoman and xmlmantohtml are two very simple scripts for converting xml \
to groff or html."
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "xmltoman-0.4-2.9.noarch.rpm"
RPM_HASH = "53fbad9b2ad93d4316a00713a53eb961dbf05003c51a9ed3a8f223833179bf557dcdce4b67df88d1ae18deeda80c9c122238f3b38896e63ed512d2e3f0e4e99e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmltoman"
RDEPENDS:${PN} += "/usr/bin/perl perl(XML::Parser)"

inherit rpm
