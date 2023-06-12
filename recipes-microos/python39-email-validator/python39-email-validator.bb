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

PV = "2.0.0"

RPM_NAME = "python39-email-validator-2.0.0-1.1.noarch.rpm"
RPM_HASH = "99ccfe91ddd4d8b29a51f29d18397b4571c617c9adfe2a452e2979f049ced8a011c2aaccb2a561a988835fd52222a686f241ab88af608ed10a9d96b3a7af9687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(email-validator) \
python39-email-validator \
python39-email_validator \
python3dist(email-validator)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-dnspython \
python39-idna \
python39-setuptools \
update-alternatives"

inherit rpm
