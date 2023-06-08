SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-mathics-pygments-1.0.2-1.7.noarch.rpm"
RPM_HASH = "991991207200cf7c01e790572045449a8306eca4aa660d07f3ad1b2cb763da81b630d996043a9eb5d9ebe3af2aa590241783ada26e665b9e1ea5986db146761d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mathics-pygments) python39-mathics-pygments python3dist(mathics-pygments)"
RDEPENDS:${PN} += "python(abi) python39-Mathics-Scanner python39-Pygments"

inherit rpm
