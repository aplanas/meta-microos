SUMMARY = "Python Chart Generator"
DESCRIPTION = "Pychart is a Python library for creating high-quality \
charts in Postscript, PDF, PNG, and SVG. \
It produces line plots, bar plots, range-fill plots, and pie \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "python311-PyChart-1.39-1.14.noarch.rpm"
RPM_HASH = "6397d431bcfe56ad33dc4f2c122c3e4a7cd9f1a91600a06b38767022f608ec8416d65afbd04790aa9448021d30fbf99eb04450646832013a39c52d3ed8b8bdbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pychart) python311-PyChart python3dist(pychart)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
