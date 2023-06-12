SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-pydotplus-2.0.2-3.22.noarch.rpm"
RPM_HASH = "64d448becb0fb1eea1283999cfbfb7e36ebe1c42806351ce46b5538bad0fd2fe10e43fcd2596391e7356e0b5e28c6d5f0c44a2dfcc8fc4783a2763591f5b7b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydotplus) \
python39-pydotplus \
python3dist(pydotplus)"
RDEPENDS:${PN} += "graphviz \
python(abi) \
python39-pyparsing"

inherit rpm
