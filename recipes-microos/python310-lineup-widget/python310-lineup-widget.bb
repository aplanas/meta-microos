SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-lineup-widget-4.0.0-1.8.noarch.rpm"
RPM_HASH = "c09c414684635f5f09f34a09b0352ae1ac48fb4db16c593b70558f8e2edfd7f8878d7c2503e339d952d65fecafbf7d927db28980536564713278c99445c7583c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lineup-widget \
python3.10dist(lineup-widget) \
python310-lineup-widget \
python3dist(lineup-widget)"
RDEPENDS:${PN} += "python(abi) \
python310-ipywidgets \
python310-notebook \
python310-pandas"

inherit rpm
