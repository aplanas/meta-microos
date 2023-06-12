SUMMARY = "Python modules for syslog-ng"
DESCRIPTION = "This package provides python modules for syslog-ng, for \
Kubernetes log enrichment, Hypr support, etc."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-python-modules-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "18ca8930676e4bcf96ff8f0f4211b814fda4e2aa36b8e5bcd731fcd651a26a11c3715f9fbbfbcffd7fce88d20a79ba4f8b60191d33806add7af445fa7fc4311f"

RPROVIDES:${PN} += "syslog-ng-python-modules \
syslog-ng-python-modules(aarch-64)"
RDEPENDS:${PN} += "python3-PyYAML \
python3-cachetools \
python3-certifi \
python3-charset-normalizer \
python3-google-auth \
python3-idna \
python3-kubernetes \
python3-pip \
python3-pyasn1 \
python3-pyasn1-modules \
python3-python-dateutil \
python3-requests \
python3-rsa \
python3-six \
python3-websocket-client \
syslog-ng \
syslog-ng-python"

inherit rpm
