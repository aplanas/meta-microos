SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python310-sphinxcontrib-devhelp-1.0.2-2.1.noarch.rpm"
RPM_HASH = "5978cecc981fd6e4bf91614a4e4d90318bfd04d73e9333d47fd18155e1fca9237ab2ac96e78f42e92a38f2c7589c726f52030250ac0a03d95a05f0b29f574822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-devhelp \
python3.10dist(sphinxcontrib-devhelp) \
python310-sphinxcontrib-devhelp \
python3dist(sphinxcontrib-devhelp)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
