SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python311-sphinxcontrib-htmlhelp-2.0.1-2.1.noarch.rpm"
RPM_HASH = "ec63f5cdfcd665d7743c648635a365cd9535aa932f887b73f1093f650d17a62a1adde4c53e6ec42b59ae1faa1d28a0533507df55f5aac04cbfd89a92557159b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-htmlhelp) python311-sphinxcontrib-htmlhelp python3dist(sphinxcontrib-htmlhelp)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
