SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python39-sphinx-feature-classification-1.1.0-2.10.noarch.rpm"
RPM_HASH = "d1383494c7fd4d8b60bfe912712412fcdc419ff13b13c7190ba5d79830ece6e9aa2511cebf20c827cbe385f96080f3af220f0b322e94b4e971266ba36cbdbf5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-feature-classification) \
python39-sphinx-feature-classification \
python3dist(sphinx-feature-classification)"
RDEPENDS:${PN} += "python(abi) \
python39-docutils \
python39-pbr"

inherit rpm
