SUMMARY = "ACME client"
DESCRIPTION = "certbot is a free, automated certificate authority that aims \
to lower the barriers to entry for encrypting all HTTP traffic on the internet."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-1.31.0-1.4.noarch.rpm"
RPM_HASH = "685758ebcae7a5b55c717cf7a3a87b21af80c80497c44a2d9edc3b3e246241278281cbea1925fc3d8ca8efb9397f13ee5f008eb6e6007b235c559ecbed911dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot \
python3.9dist(certbot) \
python39-certbot \
python3dist(certbot)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-acme \
python39-configargparse \
python39-configobj \
python39-cryptography \
python39-distro \
python39-future \
python39-josepy \
python39-parsedatetime \
python39-pyRFC3339 \
python39-pytz \
python39-setuptools \
python39-zope.component \
python39-zope.interface \
update-alternatives"

inherit rpm
