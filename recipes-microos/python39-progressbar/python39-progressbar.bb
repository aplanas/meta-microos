SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "LGPL-2.1-or-later | BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python39-progressbar-2.5-2.17.noarch.rpm"
RPM_HASH = "5ae10ce8262c981b86b68bddbd9b6247e9746e76c1b803b677b059eedd65ca2ff5a6f94eb922aa00894798824b2d4e96435c31c3814a773640e15b349032be58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(progressbar) \
python39-progressbar \
python3dist(progressbar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
