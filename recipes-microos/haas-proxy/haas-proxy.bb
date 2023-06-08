SUMMARY = "Man in the middle proxy for honeypot as a service"
DESCRIPTION = "HaaS proxy application forwards incoming traffic from port 22 (commonly used \
for SSH) to the HaaS server, where Cowrie honeypot simulates a device and \
records executed commands."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "haas-proxy-1.9-1.13.noarch.rpm"
RPM_HASH = "45635a9ab14ad7b510adf578cb563fbea9ca787419343c63c054f8c5130a0d927ddcdb86211abef6f4459f3e569e1c4b0555a4e518d6fb2500598bf7c5cd4f94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(haas-proxy) haas-proxy python3.10dist(haas-proxy) python3dist(haas-proxy)"
RDEPENDS:${PN} += "/bin/sh python(abi) python3-Twisted python3-base python3-cachetools python3-pycrypto python3-service_identity sshpass systemd"

inherit rpm
