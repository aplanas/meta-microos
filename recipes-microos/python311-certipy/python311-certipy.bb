SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-certipy-0.1.3-2.11.noarch.rpm"
RPM_HASH = "103171bcd5618884a825c94cd6b74d5c76b429ba772ffed61919bc75beeea8181c767c119dd1a37a1698327aada6dba97462ebefd38d7cb9fc92e65f74489fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certipy) \
python311-certipy \
python3dist(certipy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-pyOpenSSL \
update-alternatives"

inherit rpm
