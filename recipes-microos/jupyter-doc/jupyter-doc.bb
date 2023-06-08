SUMMARY = "HTML documentation for jupyter"
DESCRIPTION = "Documentation and help files for jupyter."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "jupyter-doc-1.0.0-11.1.noarch.rpm"
RPM_HASH = "7ba85099cdf8362809615010f617c71f98056c87d3bbda9fccf888c328f1b5b16bf6373a6269aa12bc46fdf9be8f6d5edb3e41f244df6d6cb63718d1138c40e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-doc jupyter-doc-html jupyter-doc-pdf python310-jupyter-doc python310-jupyter-doc-html python310-jupyter-doc-pdf python311-jupyter-doc python311-jupyter-doc-html python311-jupyter-doc-pdf python39-jupyter-doc python39-jupyter-doc-html python39-jupyter-doc-pdf"
RDEPENDS:${PN} += ""

inherit rpm
