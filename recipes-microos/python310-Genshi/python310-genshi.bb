SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.7"

RPM_NAME = "python310-Genshi-0.7.7-3.1.aarch64.rpm"
RPM_HASH = "1b5908e854f256d1a60dd193b4fa7e03e84483b0f54d53c26460816edf9d889c95a23bbd5cd88d820e04d8188daf51703d1fd7c8bf4d9779ae18e6ec4504e0f3"

RPROVIDES:${PN} += "python3-Genshi python3.10dist(genshi) python310-Genshi python310-Genshi(aarch-64) python3dist(genshi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-Babel python310-six python310-xml"

inherit rpm
