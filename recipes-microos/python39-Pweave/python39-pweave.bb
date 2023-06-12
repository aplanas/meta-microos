SUMMARY = "Scientific reports with embedded python computations"
DESCRIPTION = "Pweave is a scientific report generator and a literate programming \
tool for Python. Pweave can capture the results and plots from data \
analysis and works well with NumPy, SciPy and matplotlib. It is able \
to run python code from source document and include the results and \
capture matplotlib plots in the output. \
 \
Pweave is good for creating reports, tutorials, presentations etc. \
with embedded python code It can also be used to make websites together \
with e.g. Sphinx or rest2web."
LICENSE = "BSD-3-Clause"

PV = "0.30.3"

RPM_NAME = "python39-Pweave-0.30.3-6.4.noarch.rpm"
RPM_HASH = "913a46d616271e1d1dcf489f62b9c1c295ab6ba43225971edbc1687696808d9a68c6fd592e205ff58104767fafbdd2489f4f85ad983b309f616cc4b77848ca41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pweave) \
python39-Pweave \
python3dist(pweave)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Markdown \
python39-Pygments \
python39-certifi \
python39-jupyter_client \
python39-jupyter_ipykernel \
python39-jupyter_ipython \
python39-jupyter_nbconvert \
python39-jupyter_nbformat"

inherit rpm
