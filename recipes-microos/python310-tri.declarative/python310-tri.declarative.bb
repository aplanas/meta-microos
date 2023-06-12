SUMMARY = "Python class decorators in the style of Django model classes"
DESCRIPTION = "tri.declarative contains class decorators to define classes with \
subclass semantics in the style of django Model classes."
LICENSE = "BSD-3-Clause"

PV = "5.7.0"

RPM_NAME = "python310-tri.declarative-5.7.0-1.10.noarch.rpm"
RPM_HASH = "9ec773d401f825372c4f2b3a4a0b57715826979c05aaf4d6487530b12148cb2a9fbd1e436c0b8fe1e26e0c1c5525b42b28e25dac0f00e64a033047dcc06ce7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tri.declarative \
python3.10dist(tri.declarative) \
python310-tri.declarative \
python3dist(tri.declarative)"
RDEPENDS:${PN} += "python(abi) \
python310-tri.struct"

inherit rpm
