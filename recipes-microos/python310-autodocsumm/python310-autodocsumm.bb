SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "GPL-2.0-only"

PV = "0.2.10"

RPM_NAME = "python310-autodocsumm-0.2.10-1.1.noarch.rpm"
RPM_HASH = "7e035b50396fc61a70c4222c05b729f147a36536a238d5059318d39e77f05e9e6d4e02280b572187ab6167a3f433c5a5838c9900df8c101c9bd71bccdbee1d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autodocsumm python3.10dist(autodocsumm) python310-autodocsumm python3dist(autodocsumm)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
