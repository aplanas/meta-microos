SUMMARY = "A sidecar output widget for JupyterLab"
DESCRIPTION = "A sidecar output widget for JupyterLab. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python39-sidecar-0.5.2-5.4.noarch.rpm"
RPM_HASH = "40f08ef29bdb80342fff10ba743fa9a48a4fcafeca99898bdc207918ff289891b3d7d414cfd03a154b54dac5b9627497f460d2d20f59221aaf6e9bac3eee5b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sidecar) \
python39-sidecar \
python3dist(sidecar)"
RDEPENDS:${PN} += "(python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9) \
jupyter-sidecar-jupyterlab \
python(abi) \
python39-jupyterlab"

inherit rpm
