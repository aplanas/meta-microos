SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "19.2.0"

RPM_NAME = "python310-towncrier-19.2.0-2.13.noarch.rpm"
RPM_HASH = "61e5f998accaf4760b921751e6e8f8f4f57dc80eebd4b352c7f4e0e4e321f60d78f3d2f83352fc0c6331cd777d252744cacaaadca945ddea98254150e3af605d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-towncrier \
python3.10dist(towncrier) \
python310-towncrier \
python3dist(towncrier)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
git-core \
python(abi) \
python310-Jinja2 \
python310-click \
python310-incremental \
python310-toml \
update-alternatives"

inherit rpm
