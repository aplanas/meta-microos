SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-qstylizer-0.2.2-1.3.noarch.rpm"
RPM_HASH = "6fcf6daca7a4a74dda81eee0ee3f1c77b6ce07f925def0e2fa8c26fbff54af7a89bacd81d550c602a01933f49b7c09e33a4511742f5b9a53cdacb7e09f1c4845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(qstylizer) python311-qstylizer python3dist(qstylizer)"
RDEPENDS:${PN} += "python(abi) python311-inflection python311-tinycss2"

inherit rpm
