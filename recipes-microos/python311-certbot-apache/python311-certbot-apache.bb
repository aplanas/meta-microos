SUMMARY = "Apache plugin for Certbot"
DESCRIPTION = "The Apache plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-apache-1.31.0-1.3.noarch.rpm"
RPM_HASH = "a41cfc86c05a6ae3e27c671076aab6db4ed00175423f15d6959f67a0b16365db1a7b7a8db1fd55f1c5e79b24fb55156a258fb8d6a86b53d5d0f7980492eea7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-apache) python311-certbot-apache python3dist(certbot-apache)"
RDEPENDS:${PN} += "apache2 augeas-lenses python(abi) python311-acme python311-augeas python311-certbot"

inherit rpm
