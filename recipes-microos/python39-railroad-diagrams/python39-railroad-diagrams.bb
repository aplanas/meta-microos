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

RPM_NAME = "python39-railroad-diagrams-1.1.1-2.1.noarch.rpm"
RPM_HASH = "45f24ab77145ab3b1da14bed7c9b513a1a222cd40b8809dbf0befa49eef1e8da18e79e98340709e5ac291fc903004adb9cc3442dbfda2daab1f063d5f6704d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(railroad-diagrams) python39-railroad-diagrams python3dist(railroad-diagrams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
