SUMMARY = "Tableau Python service"
DESCRIPTION = "Tableau service to run Python scripts."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-tabpy-2.5.0-1.8.noarch.rpm"
RPM_HASH = "8e8cace17d617976b5a31dab7d2776796d90968f55414257dd7a0eab170d9e6a5c5e7d05561f9b28446c538536cf809f5e19eabb7967fce46ec2642df8f027a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tabpy) python311-tabpy python3dist(tabpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Twisted python311-cloudpickle python311-docopt python311-genson python311-jsonschema python311-pyOpenSSL python311-requests python311-simplejson python311-tornado"

inherit rpm
