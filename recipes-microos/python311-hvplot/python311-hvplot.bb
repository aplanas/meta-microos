SUMMARY = "High-level plotting API for the PyData ecosystem built on HoloViews"
DESCRIPTION = "hvPlot provides a high-level plotting API built on HoloViews that \
provides a general and consistent API for plotting data in various \
formats from the PyData ecosystem. hvPlot can integrate neatly with \
individual PyData libraries if an extension mechanism for the native \
plot APIs is offered, or it can be used as a standalone component."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python311-hvplot-0.8.3-1.1.noarch.rpm"
RPM_HASH = "a65c0a4c71e103e16ad7e6e15087e858c768e1791e2d860d6e1fcf853cb2dcdaeb0efaac1f98c2b7c01fbae829e26f5291dfa3e8ab918b5e66def52276bcdc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hvplot) python311-hvplot python3dist(hvplot)"
RDEPENDS:${PN} += "(python311-bokeh >= 1.0.0 with python311-bokeh < 2.5) python(abi) python311-colorcet python311-holoviews python311-numpy python311-packaging python311-pandas python311-panel python311-param update-alternatives"

inherit rpm
