SUMMARY = "A robust email syntax and deliverability validation library for Python"
DESCRIPTION = "A robust email address syntax and deliverability validation library \
for Python 2.7/3.4 by Joshua Tauberer. \
 \
This library validates that address are of the form ``x@y.com``. This is \
the sort of validation you would want for a login form on a website. \
 \
Key features: \
 \
* Good for validating email addresses used for logins/identity. \
* Friendly error messages when validation fails (appropriate to show to end users). \
* (optionally) Checks deliverability: Does the domain name resolve? \
* Supports internationalized domain names and (optionally) internationalized local parts. \
* Normalizes email addresses (super important for internationalized addresses! see below)."
LICENSE = "CC0-1.0"

PV = "1.3.1"

RPM_NAME = "python311-email-validator-1.3.1-1.4.noarch.rpm"
RPM_HASH = "f53fac3f2bdff5d65e634ce0891937887ec5f4d80ee0b254a19caf001069767f9f96a1e5107562a108ad4c56c19a58684d94757a399108a285a5805c8b4cda09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(email-validator) python311-email-validator python311-email_validator python3dist(email-validator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-dnspython python311-idna python311-setuptools update-alternatives"

inherit rpm
