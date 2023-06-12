SUMMARY = "Python clone of R's ggplot"
DESCRIPTION = "The ggplot package is a Python implementation of the grammar of \
graphics. It is not intended to be a feature-for-feature port of \
ggplot2 for R. There will be feature overlap, but not \
necessarily mimicry."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "python310-ggplot-0.11.5-3.11.noarch.rpm"
RPM_HASH = "004b71ac7f4f4940f7a25c22d3db386884a650b0a85e834e867c23ea0099dd600838af7a4ab562137707e763ce8ce9a91eb92a1394065e298dcd10820569ce42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ggplot \
python3.10dist(ggplot) \
python310-ggplot \
python3dist(ggplot)"
RDEPENDS:${PN} += "python(abi) \
python310-Cycler \
python310-brewer2mpl \
python310-matplotlib \
python310-numpy \
python310-pandas \
python310-patsy \
python310-scipy \
python310-six \
python310-statsmodels"

inherit rpm
