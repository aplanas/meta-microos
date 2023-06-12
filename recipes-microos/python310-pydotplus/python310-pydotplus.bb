SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-pydotplus-2.0.2-3.22.noarch.rpm"
RPM_HASH = "bb67c58654d63991c9e41e0a997ef3ed58d8636743cfbbbdd7d5ba28a059dcd537c854121bfe18eb2ebf4e89fa75e9285be9b934c4b2e29493b6a03ce3957631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydotplus \
python3.10dist(pydotplus) \
python310-pydotplus \
python3dist(pydotplus)"
RDEPENDS:${PN} += "graphviz \
python(abi) \
python310-pyparsing"

inherit rpm
