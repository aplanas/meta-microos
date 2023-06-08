SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python311-jupyter-ydoc-0.2.4-1.1.noarch.rpm"
RPM_HASH = "d5e4502494cce9e4c89f72e72bb98cbeef37b293f4dc1c20296bb9d096ab38292cb5a8722241afa39b736efeb7ae085c4c719bf94f3805b5905319ce1fd9353c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-ydoc) python311-jupyter-ydoc python311-jupyter_ydoc python3dist(jupyter-ydoc)"
RDEPENDS:${PN} += "(python311-importlib-metadata >= 3.6 if python311-base < 3.10) (python311-y-py >= 0.5.3 with python311-y-py < 0.6.0) python(abi)"

inherit rpm
