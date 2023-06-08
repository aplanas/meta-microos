SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-whichcraft-0.6.1-1.14.noarch.rpm"
RPM_HASH = "86995f3e5f7af76e08375bccc3d89e011bf4b29c072491b70e41cf2354e061ff3d9418268b838e488a3850e0ccd9929e1f643ba78857370da18f9e111be38999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(whichcraft) python39-whichcraft python3dist(whichcraft)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
