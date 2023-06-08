SUMMARY = "Terminus Truetype Fonts"
DESCRIPTION = "Terminus TTF is a TrueType version of the great Terminus Font, a \
fixed-width bitmap font optimised for long work with computers."
LICENSE = "OFL-1.1"

PV = "4.49.3"

RPM_NAME = "terminus-ttf-fonts-4.49.3-1.1.noarch.rpm"
RPM_HASH = "e1d4408b56b36be32ea4021e69a7962490c8ee13268780ce6d7d20366fd7536d8c87dd83889c9bdb6a22f443b6d43af73235413b7031759308ce44a9d7fbc48e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminus-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
