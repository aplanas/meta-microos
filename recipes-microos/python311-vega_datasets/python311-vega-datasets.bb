SUMMARY = "A Python package for offline access to Vega datasets"
DESCRIPTION = "A Python package for offline access to vega datasets. \
- Provide straightforward access in Python to the datasets made available \
- return the results in the form of a Pandas dataframe \
- wherever dataset size and/or license constraints make it possible, bundle the dataset with the package so that datasets can be loaded in the absence of a web connection"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-vega_datasets-0.9.0-1.9.noarch.rpm"
RPM_HASH = "febd247db420bde2ec440d2917b79d228ca70d51f11a471af5c60e013ff1a40d7e7728ba92d98119ad25c3352dc71ad8b44dde477ba103f17c747c1a42248b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vega-datasets) python311-vega_datasets python3dist(vega-datasets)"
RDEPENDS:${PN} += "python(abi) python311-pandas"

inherit rpm
