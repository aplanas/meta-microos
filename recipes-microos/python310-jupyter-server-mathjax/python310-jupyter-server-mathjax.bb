SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python310-jupyter-server-mathjax-0.2.6-1.7.noarch.rpm"
RPM_HASH = "afb819e34ab041ced9d77cbd800980fd2fd2fd96d2b822bd09021ea356e0de22bae9533ef4d59548c1d1b889ba02069b13f7a4a500aa2b071b1754d99aa82d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-mathjax python3.10dist(jupyter-server-mathjax) python310-jupyter-server-mathjax python3dist(jupyter-server-mathjax)"
RDEPENDS:${PN} += "jupyter-server-mathjax python(abi) python310-jupyter_server"

inherit rpm
