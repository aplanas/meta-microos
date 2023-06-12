SUMMARY = "Octave-Forge documentation tests"
DESCRIPTION = "The Octave-Forge Doctest package finds specially-formatted blocks of example \
code within documentation files. It then executes the code and confirms \
the output is correct. This can be useful as part of a testing framework \
or simply to ensure that documentation stays up-to-date during software development. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "octave-forge-doctest-0.8.0-1.2.noarch.rpm"
RPM_HASH = "322fc3cdb0f95c1e9afc9857d228aa731203def75926e06439b753384ccac73118b83ce0ccb160cfe7b5e13c163c420f0de03114bdc934b7a98ae40b5c6631cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-doctest"
RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
