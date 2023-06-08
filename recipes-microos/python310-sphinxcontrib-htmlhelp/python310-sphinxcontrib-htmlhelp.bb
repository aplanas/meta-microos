SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python310-sphinxcontrib-htmlhelp-2.0.1-2.1.noarch.rpm"
RPM_HASH = "760fde41bbd50bf124a8be07097f25d5b05a948378ac16808b286795f45f358f5a579d091d779fc8caa4e0abe10f0574cda58b4d47804579ba37350acff8e0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-htmlhelp python3.10dist(sphinxcontrib-htmlhelp) python310-sphinxcontrib-htmlhelp python3dist(sphinxcontrib-htmlhelp)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
