SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python39-imbox-0.9.8-1.12.aarch64.rpm"
RPM_HASH = "501dfabd05cf55546ffd7731fe4b0253f4a5320095c962c886e402cda33d1e3ad7ec9335e9757c154bb7d476624068bc815d1b30a4f391a14c92c9ec1081871e"

RPROVIDES:${PN} += "python3.9dist(imbox) python39-imbox python39-imbox(aarch-64) python3dist(imbox)"
RDEPENDS:${PN} += "python(abi) python39-chardet"

inherit rpm
