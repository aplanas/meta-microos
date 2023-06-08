SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python310-cymruwhois-1.6-2.13.noarch.rpm"
RPM_HASH = "0d4d4e7a4a64fa611954501b723f5c41da845a84837e693243eee3685172715e940ddfe9ddd1f618945a16dcf1665ed18f52b7294f056eaf3048e2e0bdf85512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois python3-cymruwhois python3.10dist(cymruwhois) python310-cymruwhois python3dist(cymruwhois)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
