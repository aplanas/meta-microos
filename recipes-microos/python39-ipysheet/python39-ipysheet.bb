SUMMARY = "Spreadsheet widget for the Jupyter notebook"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
WARNING \
Due to Handsontable licensing changes ipysheet is stuck witch the \
outdated Handsontable version 6.2.2 (open-source). We recommend \
not using ipysheet anymore. We suggest an alternative like \
ipydatagrid. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-ipysheet-0.7.0-1.5.noarch.rpm"
RPM_HASH = "89b57cf91e56dba071bcb7017d36e9b6f613d9379302bf4d765d02b601fac81be07c521d0f022d854a402d26ef1204e9e96103b2daa70e7ccd3434b1a4e9629d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipysheet) \
python39-ipysheet \
python3dist(ipysheet)"
RDEPENDS:${PN} += "(python39-ipywidgets >= 7.5.0 with python39-ipywidgets < 9) \
jupyter-ipysheet \
python(abi)"

inherit rpm
