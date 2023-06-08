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

RPM_NAME = "python311-pip-run-8.8.2-2.1.noarch.rpm"
RPM_HASH = "134fafc6f4af2f88101cce36dec3cb74dfcf12d4b9997205431c31f226841d23e4f931b07d5414f9fc27caf4a2fe4048a3ae12a2a307bfcff884588051799ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip-run) python311-pip-run python3dist(pip-run)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-autocommand python311-packaging python311-path python311-pip update-alternatives"

inherit rpm
