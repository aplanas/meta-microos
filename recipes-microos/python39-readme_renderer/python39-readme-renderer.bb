SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "37.3"

RPM_NAME = "python39-readme_renderer-37.3-3.1.noarch.rpm"
RPM_HASH = "0c8c506ba3bfe359ca036dab0d3a0bc7c1957bc2e35cadae77cbc9749724f9b5ba6ac7f8ddc5696ca021ed0fc8849a703cfcd6a742abf040dcf5e852fe479ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(readme-renderer) \
python39-readme_renderer \
python3dist(readme-renderer)"
RDEPENDS:${PN} += "python(abi) \
python39-Pygments \
python39-bleach \
python39-docutils"

inherit rpm
