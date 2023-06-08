SUMMARY = "Composable, declarative visualizations for Python"
DESCRIPTION = "HoloViews is a Python library for automated plotting of annotated \
data. \
 \
Instead of building a plot using direct calls to a plotting library, \
the developer instead first describes the data with semantic \
information and then additional metadata to determine more detailed \
aspects of the visualization. This approach provides automatic \
visualization that can be requested at any time as the data evolves, \
rendered automatically by one of the supported plotting libraries \
(such as Bokeh or Matplotlib)."
LICENSE = "BSD-3-Clause"

PV = "1.15.4"

RPM_NAME = "python311-holoviews-1.15.4-1.2.noarch.rpm"
RPM_HASH = "e94997bd55df8294c9389d45a7863ec36563c1fe4398ad03eaef92e33d60a0d397ea6944ec01ae5d73d776f52e88f0b0480daa74bdd40d857587f7068e14a5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(holoviews) python311-holoviews python3dist(holoviews)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-colorcet python311-numpy python311-packaging python311-pandas python311-panel python311-param python311-pyviz-comms update-alternatives"

inherit rpm
