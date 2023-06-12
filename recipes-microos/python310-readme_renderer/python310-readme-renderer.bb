SUMMARY = "A library for rendering 'readme' descriptions"
DESCRIPTION = "Readme Renderer is a library that will safely render arbitrary ``README`` files \
into HTML. It is designed to be used in Warehouse to render the \
long_description for packages."
LICENSE = "Apache-2.0"

PV = "37.3"

RPM_NAME = "python310-readme_renderer-37.3-3.1.noarch.rpm"
RPM_HASH = "49716c728190f1ab947dee15d81f73b3c9e869c85746756852c8e0778d07235b66bf17342ad2a558f316fa33d0d1261c803097933e0a05b68a19c025b2bafe0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-readme_renderer \
python3.10dist(readme-renderer) \
python310-readme_renderer \
python3dist(readme-renderer)"
RDEPENDS:${PN} += "python(abi) \
python310-Pygments \
python310-bleach \
python310-docutils"

inherit rpm
