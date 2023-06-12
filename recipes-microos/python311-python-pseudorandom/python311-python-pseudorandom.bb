SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "python311-python-pseudorandom-0.2.2-3.6.noarch.rpm"
RPM_HASH = "b3aeb6c1bd796679b2cb9b5e7d1dfe1fb73b1b6cf40d406737ceffbd9036d545735744d24fb612e0200245edb3bfe4bf36c1330602cf1f109f13ac53ea86f539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-pseudorandom) \
python311-python-pseudorandom \
python3dist(python-pseudorandom)"
RDEPENDS:${PN} += "python(abi) \
python311-python-datamatrix"

inherit rpm
