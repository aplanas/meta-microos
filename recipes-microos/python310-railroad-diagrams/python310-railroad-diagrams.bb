SUMMARY = "Railroad-Diagram Generator"
DESCRIPTION = "This is a small library for generating railroad diagrams (like what JSON.org uses) \
using SVG, with both JS and Python ports. \
 \
Railroad diagrams are a way of visually representing a grammar in a form that is more \
readable than using regular expressions or BNF. They can easily represent any \
context-free grammar, and some more powerful grammars. There are several railroad-diagram \
generators out there, but none of them had the visual appeal I wanted, so I wrote my own."
LICENSE = "CC0-1.0"

PV = "1.1.1"

RPM_NAME = "python310-railroad-diagrams-1.1.1-2.1.noarch.rpm"
RPM_HASH = "fc411d76dd101d00e313efeb43a4f345b4894d10e8b06d3fe4956cd4f7089b56cc2cd30e91dfdf0da7140038c6ef5dd1dadf56ed824a02fdab3e0bf6e822e496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-railroad-diagrams python3.10dist(railroad-diagrams) python310-railroad-diagrams python3dist(railroad-diagrams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
