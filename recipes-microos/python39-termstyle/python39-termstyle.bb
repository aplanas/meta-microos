SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python39-termstyle-0.1.11-7.10.noarch.rpm"
RPM_HASH = "70402e271eda116de6e412a79b33a6959321c160c167132a0b87ec87464c6de9f0cf044c56b9e68b138897b5d165b81344560d6a496b786221595cab07a6b4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(termstyle) \
python39-python-termstyle \
python39-termstyle \
python3dist(termstyle)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
