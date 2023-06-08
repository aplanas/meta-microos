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

RPM_NAME = "python311-railroad-diagrams-1.1.1-2.1.noarch.rpm"
RPM_HASH = "e97986a6c682d86aef2811e6d6ac07b4616d10739d4822bcaff7d1f7e4146889d648a78112d4f99ea7ede5c437ee6d3edca5b67be12c2b6824766a8825a0749a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(railroad-diagrams) python311-railroad-diagrams python3dist(railroad-diagrams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
