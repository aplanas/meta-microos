SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-whichcraft-0.6.1-1.14.noarch.rpm"
RPM_HASH = "0396c961ce1f5434d3362b50742ca1e9bbb4207ef83bddffab40f6b6a20419ccbcf66bb37a0688659916d63bed39b1b0af66c81363d0562d03ceac442aaa6abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(whichcraft) python311-whichcraft python3dist(whichcraft)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
