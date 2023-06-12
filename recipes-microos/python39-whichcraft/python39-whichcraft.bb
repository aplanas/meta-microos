SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-whichcraft-0.6.1-2.1.noarch.rpm"
RPM_HASH = "1dad0804dfdb961040aa63580da9f4f7d4996c9d89a5c7f237782fe91a9b9bd96c9a90d45330708b27ea4aef226533fefea1588f7493d2ef55cbd0516547ce50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(whichcraft) python39-whichcraft python3dist(whichcraft)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
