SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-parsimonious-0.10.0-1.2.noarch.rpm"
RPM_HASH = "4230a4670990ee257c7ffbca3cafe06c30b03f7e720788f5f58df748991ecbaa995edb54e98f044eca18a6b2460bd6298531a024839092048bb2bb0e366cf7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parsimonious) python39-parsimonious python3dist(parsimonious)"
RDEPENDS:${PN} += "python(abi) python39-regex"

inherit rpm
