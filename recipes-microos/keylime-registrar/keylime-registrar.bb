SUMMARY = "Keylime registrar service"
DESCRIPTION = "Subpackage of keylime for registrar service."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-registrar-7.0.0-1.1.noarch.rpm"
RPM_HASH = "75636a0604c24b4e57ef8cfe67eedd0b1fdefdc7923432a022fe016be78d27d9147e9937522b89dff3464550c2361574d77d45aabbf070aeef7129e463b7a4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-registrar"
RDEPENDS:${PN} += "/bin/sh keylime-config keylime-logrotate keylime-tpm_cert_store python3-keylime"

inherit rpm
