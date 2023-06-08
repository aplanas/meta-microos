SUMMARY = "Wrapper around the LineUpjs library for multi attribute rankings"
DESCRIPTION = "LineUp is an interactive technique designed to create, visualize and explore \
rankings of items based on a set of heterogeneous attributes. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-lineup-widget-4.0.0-1.8.noarch.rpm"
RPM_HASH = "07a33d13f315cc8542e8fe2e3612e94857d8dc6c01de9c56bd1b397ea4f51a72463b3ef1890650e9160407f10724266ec0b8cb80823f4b5ef49e5472ec12896c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lineup-widget) python39-lineup-widget python3dist(lineup-widget)"
RDEPENDS:${PN} += "python(abi) python39-ipywidgets python39-notebook python39-pandas"

inherit rpm
