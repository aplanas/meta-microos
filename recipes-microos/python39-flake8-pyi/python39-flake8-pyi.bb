SUMMARY = "A plugin for flake8 to enable linting .pyi files"
DESCRIPTION = "A plugin for Flake8 that provides specializations for type hinting stub \
files. Especially interesting for linting typeshed."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "python39-flake8-pyi-23.1.2-1.2.noarch.rpm"
RPM_HASH = "b0c315b392fd76c6f1364a2096e7baeaa67e5d6633c589e31ae9acbca99fe9ba8a34e7343f93b61253d31bea418038905591ab28e47a8698393df31fec24f6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-pyi) \
python39-flake8-pyi \
python3dist(flake8-pyi)"
RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-base \
python39-flake8 \
python39-pyflakes \
python39-typing"

inherit rpm
