SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "5.5.2"

RPM_NAME = "jupyter-ipydatawidgets-5.5.2-9.2.noarch.rpm"
RPM_HASH = "56f85ad6f08aafc00c24134eb7d238af47ffb7601dba66d0e9c7239dcb965b158922d9abea79ec8467dd5425dd6977e291fd2722423a5be5a456d5ad73aba82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets \
jupyter-ipydatawidgets"
RDEPENDS:${PN} += "jupyter-notebook \
python3-ipydatawidgets"

inherit rpm
