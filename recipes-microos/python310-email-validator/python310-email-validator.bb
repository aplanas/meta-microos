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

RPM_NAME = "python310-email-validator-1.3.1-1.4.noarch.rpm"
RPM_HASH = "9719bf33b9f5a8d36e3c347fbb9f06d67858e42e827fff5bee8958b4a076bf3d393262abd69a3529100e60feb880d96ec126f4af69b8340354dac850a6a87345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-email-validator python3-email_validator python3.10dist(email-validator) python310-email-validator python310-email_validator python3dist(email-validator)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-dnspython python310-idna python310-setuptools update-alternatives"

inherit rpm
