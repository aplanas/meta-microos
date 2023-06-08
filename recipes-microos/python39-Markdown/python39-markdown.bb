SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.3"

RPM_NAME = "python39-Markdown-3.4.3-1.2.noarch.rpm"
RPM_HASH = "46e5450fbeb284c869e8f134cf1a2e5850b0b7048cf59df3e2de5c0c8457428945607e0cca30cd3468887f60c34581c4f428602220aae1538a3b3760a1cc040f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(markdown) python39-Markdown python3dist(markdown)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-importlib-metadata update-alternatives"

inherit rpm
