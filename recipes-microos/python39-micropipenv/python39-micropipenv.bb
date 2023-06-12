SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.5"

RPM_NAME = "python39-micropipenv-1.4.5-1.4.noarch.rpm"
RPM_HASH = "23aa66e0e0a13d1e59042ae1a8b538fb5837f8464f24bfbcd753e6077ae0fe98a7c12702c8cda0539d862131a9c847307c18ec32566d3b20fa4634d410301f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(micropipenv) \
python39-micropipenv \
python3dist(micropipenv)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-pip \
update-alternatives"

inherit rpm
