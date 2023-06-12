SUMMARY = "Railroad-Diagram Generator"
DESCRIPTION = "This is a small library for generating railroad diagrams (like what JSON.org uses) \
using SVG, with both JS and Python ports. \
 \
Railroad diagrams are a way of visually representing a grammar in a form that is more \
readable than using regular expressions or BNF. They can easily represent any \
context-free grammar, and some more powerful grammars. There are several railroad-diagram \
generators out there, but none of them had the visual appeal I wanted, so I wrote my own."
LICENSE = "CC0-1.0"

PV = "3.0.1"

RPM_NAME = "python39-railroad-diagrams-3.0.1-1.1.noarch.rpm"
RPM_HASH = "b68ffbc5bf5f38e76f2ea69d894e4c6f53ba6ed4b06f3bd4d649fb624a99aafa013cc410bd2baeda044690d18ee239178f72bef15ed67e8d96ca09d6446816f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(railroad-diagrams) \
python39-railroad-diagrams \
python3dist(railroad-diagrams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
