SUMMARY = "Jupyter Sphinx Extensions"
DESCRIPTION = "Jupyter Sphinx extensions enable jupyter-specific features in sphinx."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-jupyter-sphinx-0.4.0-1.5.noarch.rpm"
RPM_HASH = "2e94a24a1b7d2c70810d558203ffd499ec8fae25d82946ff97107437822fa36539b52166258d4ab4c4080d061c535bcb691511f0b121c152eed55e29fa60a237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-sphinx) \
python311-jupyter-sphinx \
python311-jupyter_sphinx \
python3dist(jupyter-sphinx)"
RDEPENDS:${PN} += "python(abi) \
python311-IPython \
python311-Sphinx \
python311-ipywidgets \
python311-nbconvert \
python311-nbformat"

inherit rpm
