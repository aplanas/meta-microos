SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "python311-sphinxcontrib-qthelp-1.0.3-3.1.noarch.rpm"
RPM_HASH = "37908d4ab4833278900dc7b563e800fe3473f161045642f193ad57e34f47f9ba979c652ffe9b3a1bb5d369fcb2293d8f9be0c6edf9d9f1857bbd56d2a5383503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-qthelp) python311-sphinxcontrib-qthelp python3dist(sphinxcontrib-qthelp)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
