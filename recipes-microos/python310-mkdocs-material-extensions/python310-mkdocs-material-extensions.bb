SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-mkdocs-material-extensions-1.1.1-2.1.noarch.rpm"
RPM_HASH = "8dc969a7dcaf1f80ea46c8b3418cf5a9e1bc3a9255e2ba4d18a175a7c6d421044b25d7496dc2ab4028d183d2fca9ec8a47d355596971886124b497a003a58f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material-extensions python3.10dist(mkdocs-material-extensions) python310-mkdocs-material-extensions python3dist(mkdocs-material-extensions)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
