SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python311-PTable-0.9.2-2.11.noarch.rpm"
RPM_HASH = "861af5d760e5b17dca524ddfe60c2d8b5da6f6b75e7cca118c23dfc74ceea243cf3e0c25380ac11cc47a80631506fa5c914d203fca9ddee8fc158a6d86bf1a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ptable) \
python311-PTable \
python3dist(ptable)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi)"

inherit rpm
