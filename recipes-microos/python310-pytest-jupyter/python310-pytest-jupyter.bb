SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-0.7.0-1.1.noarch.rpm"
RPM_HASH = "76d67f2509dac797e371431b05908cf651aca826bffb3aca7ad200e0595b40fdbacf7d52a7f54989f0d3fea0cbc5ebe07d28dce0141238c8d76c60551abd543a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter python3.10dist(pytest-jupyter) python310-pytest-jupyter python3dist(pytest-jupyter)"
RDEPENDS:${PN} += "python(abi) python310-jupyter_core python310-pytest"

inherit rpm
