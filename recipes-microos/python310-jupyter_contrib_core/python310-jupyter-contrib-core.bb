SUMMARY = "Common utilities for jupyter-contrib projects"
DESCRIPTION = "Common utilities for jupyter-contrib projects. Includes: \
 \
-   providing a notebook-4.2-compatible nbextension API in order to \
    smooth over differences in versions 4.0 and 4.1 \
-   common application components and cli scripts \
-   utility classes and functions for use in tests"
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python310-jupyter_contrib_core-0.4.2-1.4.noarch.rpm"
RPM_HASH = "8b08e212013a448bd15db11e34e718cc7497f756c77f4473f289e43f4fc887f22dab44c72082dfdb546c6de2e18b37adc513729d5e4f60be5d6240ecc010b476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_contrib_core python3-jupyter-contrib-core python3-jupyter_contrib_core python3.10dist(jupyter-contrib-core) python310-jupyter-contrib-core python310-jupyter_contrib_core python3dist(jupyter-contrib-core)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-jupyter-core python310-notebook python310-setuptools python310-tornado python310-traitlets update-alternatives"

inherit rpm
