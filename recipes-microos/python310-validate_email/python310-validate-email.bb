SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python310-validate_email-1.3-4.1.noarch.rpm"
RPM_HASH = "6862d3a5cdf29758fc8739e1ce14745ca357d5e302627c71c5cf50888184e06c98a8e759990bf66d96eef448bb41543bb719c3d92016b080dad2c2646c53252c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate_email python3.10dist(validate-email) python310-validate_email python3dist(validate-email)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
