SUMMARY = "Declarative statistical visualization library for Python"
DESCRIPTION = "This package provides a Python API for building statistical visualizations \
in a declarative manner. This API contains no actual visualization rendering \
code, but instead emits JSON data structures following the `Vega-Lite`_ \
specification. For convenience, Altair can optionally use `ipyvega`_ to \
seamlessly display client-side renderings in the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "python310-altair-4.2.2-1.4.noarch.rpm"
RPM_HASH = "de3988e7003d319ad613d3227438eabab0cb063d491cfdbd8c7782482e072a98cc4bd075f4a7f462e9d96cc18c1745c6002327bb288f7cd8afa95de5537c645a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altair \
python3.10dist(altair) \
python310-altair \
python3dist(altair)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-entrypoints \
python310-jsonschema \
python310-numpy \
python310-pandas \
python310-toolz \
python310-typing"

inherit rpm
