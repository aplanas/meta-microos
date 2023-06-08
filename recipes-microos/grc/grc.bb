SUMMARY = "Generic colouriser for everything"
DESCRIPTION = "Generic Colouriser is yet another colouriser for beautifying your \
logfiles or commands output."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "grc-1.13-1.6.noarch.rpm"
RPM_HASH = "d8302c5d0577fd47aa917b28f774e6bce4b5d7b328b56fff18c9e4093c73bcc25611109abd788cdc1145b1336f6549c66007baa93bf358797baaa59b2b80fd8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(grc) grc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
