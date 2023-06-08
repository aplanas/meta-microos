SUMMARY = "Jupyter terminal console"
DESCRIPTION = "A terminal-based console frontend for Jupyter kernels. \
This code is based on the single-process IPython terminal."
LICENSE = "BSD-3-Clause"

PV = "6.6.3"

RPM_NAME = "python311-jupyter_console-6.6.3-1.2.noarch.rpm"
RPM_HASH = "192ffcd241019b480bfcf04a9bc00e20134a85d10cdda0c83bef700dca8e3ea892e5b0aafdef3d214afb4dfd8e87db1fa8fd557efd6b0cc0956b369b04df64e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-console) python311-jupyter-console python311-jupyter_console python3dist(jupyter-console)"
RDEPENDS:${PN} += "((python311-jupyter-core >= 4.12 with python311-jupyter-core < 5.0) or python311-jupyter-core >= 5.1) /bin/sh /usr/bin/python3.11 jupyter-jupyter_console python(abi) python311-Pygments python311-ipykernel python311-ipython python311-jupyter-client python311-prompt_toolkit python311-pyzmq python311-traitlets update-alternatives"

inherit rpm
