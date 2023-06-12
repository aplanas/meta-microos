SUMMARY = "Python library for plotting charts"
DESCRIPTION = "Chartify is a Python library for creating charts."
LICENSE = "Apache-2.0"

PV = "3.0.5"

RPM_NAME = "python39-chartify-3.0.5-1.4.noarch.rpm"
RPM_HASH = "66c3d79ec739aab0945001bf83563a2a1cbee2fde50929f5dcbcb6a983915e378ca5e0d866a02067b874add4094f06281206cb61cdd9a05d0c99ec393b416a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(chartify) \
python39-chartify \
python3dist(chartify)"
RDEPENDS:${PN} += "(python3.9dist(bokeh) < 2.5 with python3.9dist(bokeh) >= 2) \
(python3.9dist(pandas) < 2 with python3.9dist(pandas) >= 1) \
(python3.9dist(scipy) < 2 with python3.9dist(scipy) >= 1) \
python(abi) \
python3.9dist(ipykernel) \
python3.9dist(ipython) \
python3.9dist(jinja2) \
python3.9dist(pillow) \
python3.9dist(pyyaml) \
python3.9dist(selenium)"

inherit rpm
