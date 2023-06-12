SUMMARY = "An implementation of JSON Reference for Python"
DESCRIPTION = "jsonref is a library for automatic dereferencing of JSON Reference \
objects for Python (supporting 2.6+ including Python 3). \
 \
This library lets you use a data structure with JSON reference objects, as if \
the references had been replaced with the referent data. \
 \
Features \
* References are evaluated lazily. Nothing is dereferenced until it is used. \
* Recursive references are supported, and create recursive python data \
  structures. \
References objects are actually replaced by lazy lookup proxy objects which are \
almost completely transparent. \
Complete docs can be found at http://jsonref.readthedocs.org/"
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python39-jsonref-0.2-1.14.noarch.rpm"
RPM_HASH = "3bd7701baeedc71570d1aa1f9b31306e2a681a1ee4b4316a9a40ae1153aad17676fd86dfe54544d4e15dc3704ade282d2e14cebee8e215bf141ac68674771ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonref) \
python39-jsonref \
python3dist(jsonref)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
