SUMMARY = "A hatch plugin to help build Jupyter packages"
DESCRIPTION = "This provides a build hook plugin for Hatch that \
adds a build step for use with Jupyter packages."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "python310-hatch-jupyter-builder-0.8.3-1.1.noarch.rpm"
RPM_HASH = "b061abf7927efdeda79c559a66bb862366dc78e7c43ae217295fc313ec33b32dd0f501fc771c4f8a0b1798d097b6612e47eef2ac98c7004c41fbd9bc8be570ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-jupyter-builder \
python3-hatch_jupyter_builder \
python3.10dist(hatch-jupyter-builder) \
python310-hatch-jupyter-builder \
python310-hatch_jupyter_builder \
python3dist(hatch-jupyter-builder)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-hatchling"

inherit rpm
