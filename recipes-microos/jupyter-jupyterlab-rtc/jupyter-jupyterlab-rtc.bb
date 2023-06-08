SUMMARY = "A Jupyter Server Extension Providing Y Documents. -- Jupyter configuration"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents. \
 \
This subpackage provides the jupyter configuration"
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "jupyter-jupyterlab-rtc-0.8.0-1.2.noarch.rpm"
RPM_HASH = "fc6a2a9c85c62b93fc496ad0728bc82813c0233a4084501d4ce8d97c71d4c4dbee90929b24a1a041b3c0ed11118d4d47ef057c11ef2816289bed8f646fad66e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-rtc jupyter-server-ydoc"
RDEPENDS:${PN} += "python3dist(jupyter-server-ydoc)"

inherit rpm
