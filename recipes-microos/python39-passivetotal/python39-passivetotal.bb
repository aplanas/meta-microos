SUMMARY = "Client for the PassiveTotal REST API"
DESCRIPTION = "Passivetotal provides a Python client library implementation into RiskIQ API \
services. The library currently provides support for the following services: \
 \
- Passive DNS queries and filters \
- WHOIS queries (search and details) \
- SSL Certificates (search and details) \
- Account configuration \
- Site actions (tagging, classifying, etc.)"
LICENSE = "GPL-2.0-only"

PV = "2.5.9"

RPM_NAME = "python39-passivetotal-2.5.9-1.7.noarch.rpm"
RPM_HASH = "361fd5baf5e43b88ddbdfb9529ca838dea37afdd0a596a308186f620ba0516aeb0bf2b5e5e86fb5a8a0b59e94b9538a83e37d1443f452d35e2202ed4522ce8b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(passivetotal) \
python39-passivetotal \
python3dist(passivetotal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-ez_setup \
python39-future \
python39-python-dateutil \
python39-requests \
python39-tldextract \
update-alternatives"

inherit rpm
