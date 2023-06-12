SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "python310-micropipenv-1.4.5-1.4.noarch.rpm"
RPM_HASH = "cb90a702761b797b42e1e983e19610720d025e6c7b9dc4fc678d130a183cd6816e0a071bfb16398afbcad4b7761cf423595d4c4f2768885715c0e81a4ec5fe00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-micropipenv \
python3.10dist(micropipenv) \
python310-micropipenv \
python3dist(micropipenv)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-pip \
update-alternatives"

inherit rpm
