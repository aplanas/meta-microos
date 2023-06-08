SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python310-wtf-peewee-3.0.4-1.10.noarch.rpm"
RPM_HASH = "6c75e5791eca1b9125bdfbf9a33436d453b6382e4b707f7c3efb61d7aa4d40ed0e35b240278e5b932c215e96ecb1f2b6deadd22c0618c1872e8b95fb656344d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wtf-peewee python3.10dist(wtf-peewee) python310-wtf-peewee python3dist(wtf-peewee)"
RDEPENDS:${PN} += "python(abi) python310-WTForms python310-peewee"

inherit rpm
