SUMMARY = "International phone number field for django models"
DESCRIPTION = "An international phone number field for django models."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python311-django-phonenumber-field-5.1.0-2.7.noarch.rpm"
RPM_HASH = "a2da98a57db1e28d04e9636fe5525c99044355f9f2258a91e29ab9aca27c0faf23f7d3c7e1996b6878877e34cd8623fed27175a5f4384ba87aba08ccdc1b71f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-phonenumber-field) python311-django-phonenumber-field python3dist(django-phonenumber-field)"
RDEPENDS:${PN} += "python(abi) python311-Babel python311-Django python311-phonenumbers"

inherit rpm
