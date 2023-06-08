SUMMARY = "Format agnostic tabular data library (XLS, JSON, YAML, CSV)"
DESCRIPTION = "Tablib is a format-agnostic tabular dataset library, written in Python. \
 \
Output formats supported: \
 \
- Excel (Sets + Books) \
- JSON (Sets + Books) \
- YAML (Sets + Books) \
- HTML (Sets) \
- TSV (Sets) \
- CSV (Sets)"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-tablib-3.3.0-1.3.noarch.rpm"
RPM_HASH = "a8d7789e690a3179d1803f271789148cd2b690c5eb07b8997dd5536710ab7529868fa80b4f6b11d3e3e15487e7be1c31656ed2223faf4570ad21817c61b3420d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tablib) python311-tablib python3dist(tablib)"
RDEPENDS:${PN} += "python(abi) python311-MarkupPy python311-PyYAML python311-odfpy python311-openpyxl python311-tabulate python311-xlrd python311-xlwt"

inherit rpm
