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

RPM_NAME = "python39-email-validator-1.3.1-1.4.noarch.rpm"
RPM_HASH = "7b3caf38d190362711de678556218db9d15728491acf54fe642828deae3c9e39f243bf6142ddfe4c7b5c90ef1649589943abfa4dbde7a2c7f94eb49913928b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(email-validator) python39-email-validator python39-email_validator python3dist(email-validator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-dnspython python39-idna python39-setuptools update-alternatives"

inherit rpm
