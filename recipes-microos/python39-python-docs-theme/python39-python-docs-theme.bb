SUMMARY = "The Sphinx theme for the CPython docs and related projects"
DESCRIPTION = "The Sphinx theme for the CPython docs and related projects"
LICENSE = "Python-2.0"

PV = "2022.1"

RPM_NAME = "python39-python-docs-theme-2022.1-1.11.noarch.rpm"
RPM_HASH = "b4a65ac9902c57563dfa274e3c9e9fa8d72c2e4793d43fa3c21b4121f85a9c358614b63acab79737cac6c6ffc0f43057cf6d4bfa6128dd379727e89dd3e9ef44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-docs-theme) \
python39-python-docs-theme \
python3dist(python-docs-theme)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
