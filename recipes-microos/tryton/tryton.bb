SUMMARY = "The client of the Tryton application platform"
DESCRIPTION = "The client of the Tryton application platform. \
A three-tiers  high-level general purpose application platform \
written in Python and use Postgresql as database engine. \
It is the core base of an Open Source ERP. \
It provides modularity, scalability and security."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.26"

RPM_NAME = "tryton-6.0.26-1.1.noarch.rpm"
RPM_HASH = "678f32ad0bfa85266326037ea654bb015dc614df23530ab8f7ef3f8fa4184c319bd677e3ff8ab34764d1e2ce21961e6535fa44aed3dd108063b1518d46791bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(tryton.desktop) mimehandler(application/tryton) python3.10dist(tryton) python3dist(tryton) tryton"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-GooCalendar python3-cairo python3-chardet python3-dateutil python3-gnupg python3-gobject python3-gobject-Gdk python3-gobject-cairo python3-pytz python3-setuptools python3-simplejson python3-xml"

inherit rpm
