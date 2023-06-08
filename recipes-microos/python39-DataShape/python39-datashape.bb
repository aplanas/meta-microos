SUMMARY = "A data description language"
DESCRIPTION = "DataShape is a language for describing data. It is an extension of the \
NumPy dtype with an emphasis on cross language support."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python39-DataShape-0.5.4-2.12.noarch.rpm"
RPM_HASH = "14aff555d460986ab4613b8267d23468f36b9779d0d96334372d5c3ebf9a03ce5f5533089827b17bb00e1ce2fc6248b3933f528eb85aeeba01da965d33dd6121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(datashape) python39-DataShape python3dist(datashape)"
RDEPENDS:${PN} += "python(abi) python39-multipledispatch python39-numpy python39-python-dateutil"

inherit rpm
