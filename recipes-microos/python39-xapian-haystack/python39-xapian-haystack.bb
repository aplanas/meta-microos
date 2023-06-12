SUMMARY = "Backend of Django-Haystack for the Xapian search engine"
DESCRIPTION = "Xapian-haystack is a backend of Django-Haystack for the Xapian search engine."
LICENSE = "GPL-2.0-only"

PV = "2.1.1"

RPM_NAME = "python39-xapian-haystack-2.1.1-1.11.noarch.rpm"
RPM_HASH = "0ee4f6afb401b0cd9a318d4abacbee38c6aa44f6b6cee5e47f4dfd8c7b9a23e55d2defcee4609dc46f003a38677b7b047bf6229ebc86781e020539d46ffd06e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xapian-haystack) \
python39-xapian-haystack \
python3dist(xapian-haystack)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-django-haystack"

inherit rpm
