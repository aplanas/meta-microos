SUMMARY = "LaTeX environments for Jupyter notebook"
DESCRIPTION = "Jupyter notebook extension which supports (some) LaTeX environments \
within markdown cells. Also provides support for labels and \
crossreferences, document wide numbering, bibliography, and more. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "python39-jupyter_latex_envs-1.4.6-5.7.noarch.rpm"
RPM_HASH = "42c769fe753e65bf79d6944dfc429cbae4410c0843d27f92d86a4ed06860976bb5a3d91d854c8398ce2dcac3f6c2ccd451c8340e835579128d950e4fcd00f840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-latex-envs) python39-jupyter_latex_envs python3dist(jupyter-latex-envs)"
RDEPENDS:${PN} += "python(abi) python39-ipython python39-jupyter_core python39-nbconvert python39-notebook python39-traitlets"

inherit rpm
