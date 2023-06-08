SUMMARY = "Cookiecutter template pytest plugin"
DESCRIPTION = "The pytest plugin for your Cookiecutter templates."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python3-pytest-cookies-0.5.1-3.6.noarch.rpm"
RPM_HASH = "e4fcb79f2df37e19c9ae871894d126fdb691cfd8996b0296cdb3a5110cd393a9351da819c0785324b58e30bf45faff035b883b096e1d418be50caed5be641aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cookies python3.10dist(pytest-cookies) python3dist(pytest-cookies)"
RDEPENDS:${PN} += "cookiecutter python(abi) python3-pytest"

inherit rpm
