SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.34.0"

RPM_NAME = "python311-breathe-4.34.0-5.2.noarch.rpm"
RPM_HASH = "ca06e2f39d23107ae6f55a548eb2200c6067900120d125a2f521d0e5f2a876bbb92417b6082a1fe172f1a8f1952ebff1c609242d4e406026c0872936809bd3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(breathe) python311-breathe python311-sphinxcontrib-breathe python3dist(breathe)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Sphinx python311-docutils update-alternatives"

inherit rpm
