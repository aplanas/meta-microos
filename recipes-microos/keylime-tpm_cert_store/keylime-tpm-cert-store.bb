SUMMARY = "Certify store for the TPM"
DESCRIPTION = "Subpackage of keylime for storing the TPM certificates."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "keylime-tpm_cert_store-7.0.0-1.1.noarch.rpm"
RPM_HASH = "bf41439efc1e50798c7dbc34fff454976aaca153da7c10ff9fad7b98ddddd41ae78a173641c9ea51f4c033518e90f2be30dc3bf621d7815b20bc3a4ac2b9d397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(keylime) keylime-tpm_cert_store user(keylime)"
RDEPENDS:${PN} += "/bin/sh python3-keylime sysuser-shadow"

inherit rpm
