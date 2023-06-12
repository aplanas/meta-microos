SUMMARY = "Versioning It with your Version In Git"
DESCRIPTION = "Python Setuptools plugin for automatically determining your package's version \
based on your version control repository's tags. Unlike others, it allows easy \
customization of the version format and even lets you easily override the \
separate functions used for version extraction & calculation."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-versioningit-2.2.0-1.4.noarch.rpm"
RPM_HASH = "1816989efbb068b26cf09e42a7c249ca747d400969627d735762684ab19460d3bc1e20cc69fa5cb0b8a300a4a0f088918a4f05fbeb07b0832bf48d7e4d1b15fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioningit \
python3.10dist(versioningit) \
python310-versioningit \
python3dist(versioningit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-packaging \
python310-setuptools \
python310-tomli"

inherit rpm
