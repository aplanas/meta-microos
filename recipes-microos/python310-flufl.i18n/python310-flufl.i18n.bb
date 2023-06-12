SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python310-flufl.i18n-4.1.1-2.4.noarch.rpm"
RPM_HASH = "5ec4fca7f68985389fa16bf9d658024561274a658464381e57878e7e523a48fae292fe41f3a17f85fc58d981a6c6258cf73b2a5258cb45465e7d7bcdb0681040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.i18n \
python3.10dist(flufl.i18n) \
python310-flufl.i18n \
python3dist(flufl.i18n)"
RDEPENDS:${PN} += "python(abi) \
python310-atpublic"

inherit rpm
