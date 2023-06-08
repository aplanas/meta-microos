SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.4.3"

RPM_NAME = "python311-Markdown-3.4.3-1.2.noarch.rpm"
RPM_HASH = "3496d6ecdd45c07c501c0b5ab500754db946ad2ca32f7dd91ecfe3b922dd248c7a9f498358dcee37158cc9337ed41351491126e0701582f6ca2b9bf401310374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(markdown) python311-Markdown python3dist(markdown)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
