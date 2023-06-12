SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "2.2.3"

RPM_NAME = "python39-lazr.config-2.2.3-1.8.noarch.rpm"
RPM_HASH = "9c19db12c092f4c191541dc0e6fd1d988604a11211af5766dca11526a15c1a912f7e115b6bd5a31d700d2ee1854cd35f85f0f72027d3beb2f24d05869f05edbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lazr.config) \
python39-lazr.config \
python3dist(lazr.config)"
RDEPENDS:${PN} += "python(abi) \
python39-lazr.delegates \
python39-zope.interface"

inherit rpm
