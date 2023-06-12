SUMMARY = "Validation library and CLI tool for checking on 'pyprojecttoml'"
DESCRIPTION = "Validation library and CLI tool for checking on 'pyproject.toml' files using JSON Schema"
LICENSE = "BSD-3-Clause & MIT & MPL-2.0"

PV = "0.13"

RPM_NAME = "python39-validate-pyproject-0.13-1.1.noarch.rpm"
RPM_HASH = "57a3d5839779ca51425ee69ba2249f05d79a1c16aa02544f2ed8bbf21b151da564a0ba92162c362405c8ebf0870568d7a7db25105c892ba264191e10e8f3c41f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(validate-pyproject) \
python39-validate-pyproject \
python39-validate_pyproject \
python3dist(validate-pyproject)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-fastjsonschema \
update-alternatives"

inherit rpm
