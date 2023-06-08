SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.4"

RPM_NAME = "python311-sphinxcontrib-applehelp-1.0.4-2.1.noarch.rpm"
RPM_HASH = "cea00eb3eed08d14a2819ea84cc7bde2e06c160e43cde8029303b0575b5f757f0cf890ee4a31239d57cccbe9a8a57bec850b172dd39f58da1d6408a93c61d834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-applehelp) python311-sphinxcontrib-applehelp python3dist(sphinxcontrib-applehelp)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
