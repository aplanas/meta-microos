SUMMARY = "Documentation for the LAME MP3 encoder"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-doc-3.100-5.3.aarch64.rpm"
RPM_HASH = "1242f441e6854c62925dc6e2dd5e53cfc1dbeeedad9e941ffcfe9140ac9c8b03522af37b7a8d3fe9ce9d84dcebf6e9cc6ba629f0b9d9bfb179e001173872ea5e"

RPROVIDES:${PN} += "lame-doc \
lame-doc(aarch-64)"
RDEPENDS:${PN} += "lame"

inherit rpm
