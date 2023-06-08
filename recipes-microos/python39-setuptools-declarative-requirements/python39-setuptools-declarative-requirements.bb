SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-setuptools-declarative-requirements-1.2.0-1.10.noarch.rpm"
RPM_HASH = "2cace88dcfaeb895ed92d54ab6064c31a0b742c00c11692cbd391242ed6e3a6dec1263e879fa0cb6d95752b4ce4bbbb265baa3a7a99b36165fd123e2f0b34b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-declarative-requirements) python39-setuptools-declarative-requirements python3dist(setuptools-declarative-requirements)"
RDEPENDS:${PN} += "python(abi) python39-setuptools python39-toml python39-wheel"

inherit rpm
