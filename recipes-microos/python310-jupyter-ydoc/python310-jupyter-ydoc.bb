SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python310-jupyter-ydoc-0.2.4-1.1.noarch.rpm"
RPM_HASH = "876fcb90d3204bbc0fecbd52ff3a337380166e7cae436c26c531e8995d5cbc96fb8c6815b0ad11881705e7a2cf84f4bab35f5e3e8ba696623db777806510add6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-ydoc python3-jupyter_ydoc python3.10dist(jupyter-ydoc) python310-jupyter-ydoc python310-jupyter_ydoc python3dist(jupyter-ydoc)"
RDEPENDS:${PN} += "(python310-importlib-metadata >= 3.6 if python310-base < 3.10) (python310-y-py >= 0.5.3 with python310-y-py < 0.6.0) python(abi)"

inherit rpm
