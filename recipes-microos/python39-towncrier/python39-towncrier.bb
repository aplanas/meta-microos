SUMMARY = "Building newsfiles for your project"
DESCRIPTION = "Building newsfiles for your project."
LICENSE = "MIT"

PV = "19.2.0"

RPM_NAME = "python39-towncrier-19.2.0-2.13.noarch.rpm"
RPM_HASH = "739056b77833bbafdc76ee00767376bedccbfbcc2db29cd017349a375658621f16d8e86889dec1df6420cb92bb2b067abcff5155ff63070e0757e3b77100a5c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(towncrier) \
python39-towncrier \
python3dist(towncrier)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
git-core \
python(abi) \
python39-Jinja2 \
python39-click \
python39-incremental \
python39-toml \
update-alternatives"

inherit rpm
