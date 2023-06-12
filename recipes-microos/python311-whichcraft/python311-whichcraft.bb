SUMMARY = "Cross-python shutil.which functionality"
DESCRIPTION = "This is a shim for the 'shutil.which' function designed to work \
across multiple versions of Python and inside of windows, and \
originally done for Cookiecutter. The code for Python 2.x is based on \
Python 3 code that was extracted from source."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-whichcraft-0.6.1-2.1.noarch.rpm"
RPM_HASH = "fe458a3757e93449941a178403fb358f997b58f4da81a16be12402c3c07bb9f371ab34d30140e3b3b9059b5241b2e14bec080a626a9dab19d74946bd8d0d9be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(whichcraft) python311-whichcraft python3dist(whichcraft)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
