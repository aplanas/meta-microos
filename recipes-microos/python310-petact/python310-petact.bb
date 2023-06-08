SUMMARY = "A python package extraction tool"
DESCRIPTION = "Petact is a library used for installing and updating compressed tar files. \
When install_package is called, it downloads an md5 file and compares it with \
the md5 of the locally downloaded tar. If they are different, the old \
extracted files are deleted and the new tar is downloaded and extracted to \
the same place."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-petact-0.1.2-3.13.noarch.rpm"
RPM_HASH = "7fb9e9fcaa5476ce295fef0b835f7b2bed77e07975c34a036d40624862a197096c67cf7e948deab32f4c2632c424ef2e8a03c138e58896960d1c52fdcb2efcc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-petact python3.10dist(petact) python310-petact python3dist(petact)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools update-alternatives"

inherit rpm
