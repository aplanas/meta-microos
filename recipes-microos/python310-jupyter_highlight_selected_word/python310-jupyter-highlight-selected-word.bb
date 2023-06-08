SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-jupyter_highlight_selected_word-0.2.0-8.5.noarch.rpm"
RPM_HASH = "b505a41345fcfc6d89fb98a6cc0a84f87622062d5b91c8573eff9cbc44e41aaf531fe4e3f76aae89036f41049104f85fb18ff01fd54981a229a37b48cfe3e235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_highlight_selected_word python3.10dist(jupyter-highlight-selected-word) python310-jupyter_highlight_selected_word python3dist(jupyter-highlight-selected-word)"
RDEPENDS:${PN} += "python(abi) python310-notebook"

inherit rpm
