SUMMARY = "A Jupyter widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "jupyter-ipyscales-0.7.0-5.4.noarch.rpm"
RPM_HASH = "c4106d0c0567c2cb221eed6779d1218f21a9b9ef8c0a326f40f5a003e883db2d62a7cbcdf649893e0e06bcafb340cc765d08357c5183face30d61cc3b3319243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyscales"
RDEPENDS:${PN} += "(python39-ipyscales = 0.7.0 or python311-ipyscales = 0.7.0 or python310-ipyscales = 0.7.0) jupyter-notebook"

inherit rpm
