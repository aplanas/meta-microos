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

RPM_NAME = "python311-passivetotal-2.5.9-1.7.noarch.rpm"
RPM_HASH = "a3b34b98133c0562f504ade436be895ae6779e31cc01de57cd493baf4672f23f8e5c6ce1793bb5f6bf731f90c98b63b3721c0f7b555274fe661bd95e5b29b926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(passivetotal) python311-passivetotal python3dist(passivetotal)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-ez_setup python311-future python311-python-dateutil python311-requests python311-tldextract update-alternatives"

inherit rpm
