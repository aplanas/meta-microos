SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python39-jupyter-ydoc-0.2.4-1.1.noarch.rpm"
RPM_HASH = "8b42e5102c416d435deef0192c011174612e31d59108ba4aef4d894072c87919fdef6b5434f6fa370cc135fc42c8dedc3395663646e340b3489c53d2e083a6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-ydoc) python39-jupyter-ydoc python39-jupyter_ydoc python3dist(jupyter-ydoc)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 3.6 if python39-base < 3.10) (python39-y-py >= 0.5.3 with python39-y-py < 0.6.0) python(abi)"

inherit rpm
