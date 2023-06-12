SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python310-sphinxcontrib-autoprogram-doc-0.1.8-2.1.noarch.rpm"
RPM_HASH = "416aa6d9d49d5039bfcc3c491dc7d6785a7c1d10d1ddb764d09b0b0d96890f2fb2c1e7356e1c354860719880d7a3b65b87b21362f51115f2efa60711c7de7b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-autoprogram-doc \
python310-sphinxcontrib-autoprogram-doc"
RDEPENDS:${PN} += "python310-Sphinx"

inherit rpm
