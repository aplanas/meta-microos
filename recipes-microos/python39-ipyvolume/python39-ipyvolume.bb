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

RPM_NAME = "python39-ipyvolume-0.6.1-1.2.noarch.rpm"
RPM_HASH = "0e767a6730425f5b899a6ca4d1e2238bb5919332ac348cc8c2271c961bd9b3b3aa7a4b34ae6dce18e93e10b3dd9459f0a15c12497650cde762871993e99f7fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyvolume) python39-ipyvolume python3dist(ipyvolume)"
RDEPENDS:${PN} += "jupyter-ipyvolume python(abi) python39-Pillow python39-bqplot python39-ipyvue python39-ipyvuetify python39-ipywebrtc python39-ipywidgets python39-matplotlib python39-numpy python39-pythreejs python39-requests python39-traitlets python39-traittypes"

inherit rpm
