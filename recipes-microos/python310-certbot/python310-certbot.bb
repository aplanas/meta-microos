SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-1.31.0-1.4.noarch.rpm"
RPM_HASH = "5c01ae72a250f72942a335d41c2c536f61c81509f720b1712ec442d6867e6a9f4f696885c8cb63bcee3ccb96a23b09b3f8ea2093e4f56ffde82274d16b817a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot python3-certbot python3.10dist(certbot) python310-certbot python3dist(certbot)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-acme python310-configargparse python310-configobj python310-cryptography python310-distro python310-future python310-josepy python310-parsedatetime python310-pyRFC3339 python310-pytz python310-setuptools python310-zope.component python310-zope.interface update-alternatives"

inherit rpm
