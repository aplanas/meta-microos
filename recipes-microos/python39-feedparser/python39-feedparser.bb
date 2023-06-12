SUMMARY = "Universal Feed Parser Module for Python"
DESCRIPTION = "A universal feed parser module for Python that handles RSS 0.9x, RSS 1.0, RSS \
2.0, CDF, Atom 0.3, Atom 1.0 feeds."
LICENSE = "BSD-2-Clause"

PV = "6.0.10"

RPM_NAME = "python39-feedparser-6.0.10-1.5.noarch.rpm"
RPM_HASH = "7a1b6260cd13fdd568d5d104e91cc1c8acba02dd4122eef03672c049d17851bc26471f2b772c7c24705b18d149ce52e3ee5266097bc414b17d37942b33bf15f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(feedparser) \
python39-feedparser \
python3dist(feedparser)"
RDEPENDS:${PN} += "python(abi) \
python39-sgmllib3k \
python39-xml"

inherit rpm
