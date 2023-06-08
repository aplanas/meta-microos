SUMMARY = "League Of Movable Type's 'Blackout' font family"
DESCRIPTION = "A font inspired by the author filling in sans-serif newspaper \
headlines."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-blackout-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "77fda526a8ceb68b22340c92fbda06bd5f3699314f400003f53afd198302227c6f29ff4131ca6faf006f0e96846142d222910d6b2bc40004d20d837404f65861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-blackout-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
