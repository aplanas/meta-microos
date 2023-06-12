SUMMARY = "Jupyter Notebook as a Jupyter Server Extension"
DESCRIPTION = "NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend. \
 \
This project prepares for a future where JupyterLab and other frontends switch \
to Jupyter Server for their Python Web application backend. Using this package, \
users can launch Jupyter Notebook, JupyterLab and other frontends side-by-side \
on top of the new Python server backend. \
 \
This package contains the jupyterlab server configuration and desktop files"
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "jupyter-nbclassic-0.5.6-1.1.noarch.rpm"
RPM_HASH = "94a54df6e2efc0ba54634f0032bc17f21c699d189e7cf820d235710bf71223cf7c45c4fa902e36685ae4fa8998b653af9ca5c0bda9e8115bda13f61a70125df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(jupyter-nbclassic.desktop) \
jupyter-nbclassic \
mimehandler(application/x-ipynb+json)"
RDEPENDS:${PN} += "python3-nbclassic"

inherit rpm
