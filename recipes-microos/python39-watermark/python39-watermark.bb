SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python39-watermark-2.3.1-1.5.noarch.rpm"
RPM_HASH = "8256c34336fc511dc3ee2f537a5e728831776651883d630000f27f125536ff3dc6853411f289053d4e8d87d8f7c04036b62fc09882cedd65c7700dc4861fccc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(watermark) python39-jupyter_watermark python39-watermark python3dist(watermark)"
RDEPENDS:${PN} += "python(abi) python39-ipython"

inherit rpm
