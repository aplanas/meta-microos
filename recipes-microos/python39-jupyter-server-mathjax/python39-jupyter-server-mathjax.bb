SUMMARY = "MathJax resources as a Jupyter Server Extension"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "python39-jupyter-server-mathjax-0.2.6-1.7.noarch.rpm"
RPM_HASH = "92ce543119d1f48e4d1235569489cb96e925eb417bfb57c8f277d1f94c8a1e6fb9acd4a05d1e7ba9dc6dfb61f43f662f41caf13f3ca0e2e561f88c2c7643ba16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-server-mathjax) \
python39-jupyter-server-mathjax \
python3dist(jupyter-server-mathjax)"
RDEPENDS:${PN} += "jupyter-server-mathjax \
python(abi) \
python39-jupyter_server"

inherit rpm
