SUMMARY = "A data description language"
DESCRIPTION = "DataShape is a language for describing data. It is an extension of the \
NumPy dtype with an emphasis on cross language support."
LICENSE = "BSD-2-Clause"

PV = "0.5.4"

RPM_NAME = "python310-DataShape-0.5.4-2.12.noarch.rpm"
RPM_HASH = "77f61f1c87cda01f2bdc88e89f0d0cbe632a99b34f131d1469e601616c4442a55fc4ce5163efdba59035dc37978ad1f030361abbf23dc712e5521831deb4463e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataShape python3.10dist(datashape) python310-DataShape python3dist(datashape)"
RDEPENDS:${PN} += "python(abi) python310-multipledispatch python310-numpy python310-python-dateutil"

inherit rpm
