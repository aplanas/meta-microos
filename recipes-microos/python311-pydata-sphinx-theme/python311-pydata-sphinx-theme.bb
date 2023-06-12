SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pydata-sphinx-theme-0.13.1-2.1.noarch.rpm"
RPM_HASH = "73ce995508b0f45c4a61a42e32325fc388a1b3035a77633fc5b6b171155dc1021c985f158a3847a9138346375d39c4ef5d928ba6dcff976a31fd060778e509d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydata-sphinx-theme) python311-pydata-sphinx-theme python3dist(pydata-sphinx-theme)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-beautifulsoup4 python311-docutils python311-sphinx-theme-builder"

inherit rpm
