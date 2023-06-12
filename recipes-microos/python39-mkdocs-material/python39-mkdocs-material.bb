SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.15"

RPM_NAME = "python39-mkdocs-material-9.1.15-1.1.noarch.rpm"
RPM_HASH = "8637ce700cebb26f26a0fd75b6d3798a72047beb0990e8795e064c5807468f8ff2b8c3f356e9af3d8cadc668f711623d9b7a445bed4839a75049efed097017ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mkdocs-material) python39-mkdocs-material python3dist(mkdocs-material)"
RDEPENDS:${PN} += "python(abi) python39-Markdown python39-colorama python39-jinja2 python39-mkdocs python39-mkdocs-material-extensions python39-pygments python39-pymdown-extensions python39-regex python39-requests"

inherit rpm
