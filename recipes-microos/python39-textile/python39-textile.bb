SUMMARY = "Textile processing for python"
DESCRIPTION = "This is a Python implementation of the Textile \
(http://textism.com/tools/textile) markup language. \
 \
Textile is a XHTML generator using a simple markup developed by Dean \
Allen. This is a Python port with support for code validation, itex to \
MathML translation, Python code coloring and much more."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python39-textile-4.0.2-1.9.aarch64.rpm"
RPM_HASH = "b148db3bd04eb521411a33da2db1d1db9cf7937a290c5f8710871c519eefbf97c3fc87aff619be4a8df567494f5bd5b58aba993c48a8365fede568d760e1d07d"

RPROVIDES:${PN} += "python3.9dist(textile) python39-textile python39-textile(aarch-64) python3dist(textile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Pillow python39-html5lib python39-six update-alternatives"

inherit rpm
