SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.11"

RPM_NAME = "python39-mkdocs-material-9.1.11-1.1.noarch.rpm"
RPM_HASH = "7476d626af5ff2cc281ab4f71671a0905205b135f9a8fddf1253a5041a4ecfe80bb74b17e05b5355d8bcfe0cab83d0303ae78e39c49416204cfcacff74e489d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mkdocs-material) python39-mkdocs-material python3dist(mkdocs-material)"
RDEPENDS:${PN} += "python(abi) python39-Markdown python39-colorama python39-jinja2 python39-mkdocs python39-mkdocs-material-extensions python39-pygments python39-pymdown-extensions python39-regex python39-requests"

inherit rpm
