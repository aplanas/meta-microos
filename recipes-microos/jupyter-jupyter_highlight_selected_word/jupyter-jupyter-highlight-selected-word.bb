SUMMARY = "Jupyter notebook extension to highlight every instance of the current word"
DESCRIPTION = "Jupyter notebook extension that enables highlighting of all instances of the \
currently-selected or cursor-adjecent word in either the current cell's editor, \
or in the whole notebook. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "jupyter-jupyter_highlight_selected_word-0.2.0-8.5.noarch.rpm"
RPM_HASH = "16c23529369ac4d1c1421204e3578c886589857c38d450a6c593f138628544d09bae50ed2708a0ee41fb7775062f20da68f6b95e87c5753e67c433c2bd6d5750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_highlight_selected_word"
RDEPENDS:${PN} += "jupyter-notebook python3-jupyter_highlight_selected_word"

inherit rpm
