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

RPM_NAME = "python311-Pweave-0.30.3-6.4.noarch.rpm"
RPM_HASH = "91570703e1723f6f72d148149b845e7a1d5d45f7bdeb1c2b4db730ce0ef288b86c908559c96951323f8b94f67b3a87a19b9de4d19a8a51f770b40523f0e74ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pweave) python311-Pweave python3dist(pweave)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Markdown python311-Pygments python311-certifi python311-jupyter_client python311-jupyter_ipykernel python311-jupyter_ipython python311-jupyter_nbconvert python311-jupyter_nbformat"

inherit rpm
