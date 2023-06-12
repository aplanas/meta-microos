SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
Ipyvolume currently can \
- Do (multi) volume rendering. \
- Create scatter plots (up to ~1 million glyphs). \
- Create quiver plots (like scatter, but with an arrow pointing in a particular direction). \
- Render isosurfaces. \
- Do lasso mouse selections. \
- Render in the Jupyter notebook, or create a standalone html page (or snippet to embed in your page). \
- Render in stereo, for virtual reality with Google Cardboard. \
- Animate in d3 style, for instance if the x coordinates or color of a scatter plots changes. \
- Animations / sequences, all scatter/quiver plot properties can be a list of arrays, which can represent time snapshots. \
- Stylable (although still basic) \
- Integrates with \
  + ipywidgets for adding gui controls (sliders, button etc), see an example at the documentation homepage \
  + bokeh by linking the selection \
  + bqplot by linking the selection \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python310-ipyvolume-0.6.1-1.3.noarch.rpm"
RPM_HASH = "95cbf9cd14c5f58f3a5bfe37e80edababf9403b90cd8a289b57a42078efabc79c71e68ed41c1d415c22f2d65dc83d4181343a7be017bde2c1e246fff31e6657c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvolume \
python3.10dist(ipyvolume) \
python310-ipyvolume \
python3dist(ipyvolume)"
RDEPENDS:${PN} += "jupyter-ipyvolume \
python(abi) \
python310-Pillow \
python310-bqplot \
python310-ipyvue \
python310-ipyvuetify \
python310-ipywebrtc \
python310-ipywidgets \
python310-matplotlib \
python310-numpy \
python310-pythreejs \
python310-requests \
python310-traitlets \
python310-traittypes"

inherit rpm
