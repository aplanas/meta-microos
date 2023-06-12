SUMMARY = "Sphinx theme used by Guzzle"
DESCRIPTION = "This package contains the python bindings of the Sphinx theme used by Guzzle."
LICENSE = "MIT & OFL-1.1"

PV = "0.7.11"

RPM_NAME = "python311-guzzle_sphinx_theme-0.7.11-2.15.noarch.rpm"
RPM_HASH = "8a1f39289c8bd6e6fe7bc070be1293ec2f77f06fcfb29dba1647365b9e60a36761c858108e0e36299967ae3daebbe74162470eb2b7e7583d3ebd4aaddcd6fc85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(guzzle-sphinx-theme) \
python311-guzzle_sphinx_theme \
python3dist(guzzle-sphinx-theme)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
