SUMMARY = "Install packages and run Python with them"
DESCRIPTION = "On-demand temporary package installation for a single interpreter run. \
 \
pip-run is not intended to solve production dependency management, \
but does aim to address the other, one-off scenarios around dependency management \
  - trials and experiments \
  - build setup \
  - test runners \
  - just in time script running \
  - interactive development \
  - bug triage \
 \
pip-run is a compliment to Pip and Virtualenv and Setuptools, intended to more \
readily address the on-demand needs."
LICENSE = "MIT"

PV = "8.8.2"

RPM_NAME = "python310-pip-run-8.8.2-2.1.noarch.rpm"
RPM_HASH = "0e133d375b862a9d8641f661d36ed4a347eda4e579ebd8f9a2f47320c3ff22497226acc38c5ff6e31b596bccb51b81f88ecc725bf5f077fdcfed6cc77a3d99c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-run \
python3.10dist(pip-run) \
python310-pip-run \
python3dist(pip-run)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-autocommand \
python310-packaging \
python310-path \
python310-pip \
update-alternatives"

inherit rpm
