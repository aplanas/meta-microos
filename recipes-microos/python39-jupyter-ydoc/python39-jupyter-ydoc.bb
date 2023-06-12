SUMMARY = "Document structures for collaborative editing using Ypy"
DESCRIPTION = "Ypy-based data structures for various documents used in the Jupyter ecosystem. \
Built-in documents include: \
  - `YBlob`: a generic immutable binary document. \
  - `YUnicode`: a generic UTF8-encoded text document (`YFile` is an alias to `YUnicode`). \
  - `YNotebook`: a Jupyter notebook document."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python39-jupyter-ydoc-0.2.4-1.2.noarch.rpm"
RPM_HASH = "5e9f55c89d2852e683d9edb2c0428cb0e60e85acfb9bae938b913328e6fdfbe5714db40938886466d5329ed12644806fd15fefde2bde409ed86c44a1f115cc8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-ydoc) python39-jupyter-ydoc python39-jupyter_ydoc python3dist(jupyter-ydoc)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 3.6 if python39-base < 3.10) (python39-y-py >= 0.5.3 with python39-y-py < 0.6.0) python(abi)"

inherit rpm
