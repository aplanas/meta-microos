SUMMARY = "Material theme for mkdocs"
DESCRIPTION = "Material theme for mkdocs"
LICENSE = "MIT"

PV = "9.1.11"

RPM_NAME = "python310-mkdocs-material-9.1.11-1.1.noarch.rpm"
RPM_HASH = "2ec03dec1f4c40fd42c065f00db289925b920b41260bc1c96c78b711854055ed5e866b1a150e20a685c5ca61fb81bec0b66430d1c5a3c9af5a41cfefdd29fd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material python3.10dist(mkdocs-material) python310-mkdocs-material python3dist(mkdocs-material)"
RDEPENDS:${PN} += "python(abi) python310-Markdown python310-colorama python310-jinja2 python310-mkdocs python310-mkdocs-material-extensions python310-pygments python310-pymdown-extensions python310-regex python310-requests"

inherit rpm
