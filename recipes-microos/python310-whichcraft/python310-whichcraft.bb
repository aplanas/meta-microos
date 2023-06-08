SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-whichcraft-0.6.1-1.14.noarch.rpm"
RPM_HASH = "ccf53a13f1d8b3514564baac842b021122891445678617fbf042343ed52fb4890a8a7d08fefc40ad7eeede3cc8271c89bb375ce56196252651f06c18737cef1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whichcraft python3.10dist(whichcraft) python310-whichcraft python3dist(whichcraft)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
