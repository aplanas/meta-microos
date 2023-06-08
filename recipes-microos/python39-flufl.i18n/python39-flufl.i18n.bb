SUMMARY = "High level API for internationalizing Python libraries and applications"
DESCRIPTION = "High level API for internationalizing Python libraries and applications."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python39-flufl.i18n-4.1.1-2.4.noarch.rpm"
RPM_HASH = "6e74107cfd383bdd2b01fe3385a4105afea4962518eee7710221bfa4ec424cfea2a97d1a659841633345cb291af8c8e60fcdcdb6330b484e5de3dee020819ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flufl.i18n) python39-flufl.i18n python3dist(flufl.i18n)"
RDEPENDS:${PN} += "python(abi) python39-atpublic"

inherit rpm
