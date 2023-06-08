SUMMARY = "Documentation for python-blinker"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender. \
 \
This sub-package contains the HTML documentation."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python-blinker-doc-1.5-3.1.noarch.rpm"
RPM_HASH = "d55d9c0b997676b793e39d80b10d984db02f05df523e664fb040f3fceeff8a286c5211ea07456ad25dadd936680590791aa3ac73dbe9164fed46b9446750fe54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blinker-doc python310-blinker-doc python311-blinker-doc python39-blinker-doc"
RDEPENDS:${PN} += ""

inherit rpm
