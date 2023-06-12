SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python39-validate_email-1.3-4.1.noarch.rpm"
RPM_HASH = "cb498679964954d60c459e0f1fe0e90fe85f4842b01cefbefdf052a1740c9e909173f0b6667b5b12eb85051b3a14c19143b276c274ea9c775e16e01fe5cd8eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(validate-email) \
python39-validate_email \
python3dist(validate-email)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
