SUMMARY = "Grid for sorting and filtering DataFrames in Jupyter notebooks"
DESCRIPTION = "An Interactive Grid for Sorting and Filtering DataFrames in Jupyter Notebook. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python311-qgrid-1.3.1-5.3.noarch.rpm"
RPM_HASH = "099f3cd81660e377d9a35e5490766cd6f708ea18bc1176db7baf5832a2ec6978f57e64888d9919dca20b87249199359cfac34bc0f029d3a8d68e648e9684fd89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qgrid) \
python311-qgrid \
python3dist(qgrid)"
RDEPENDS:${PN} += "jupyter-qgrid \
python(abi) \
python311-ipywidgets \
python311-notebook \
python311-pandas"

inherit rpm
