SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0+"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python39-usfm2osis-0.6.1+git.1613099315.8fda304-1.4.noarch.rpm"
RPM_HASH = "f5df2454527fcb9de94bf212170c84bda132b88cb6114950385f4acae97466975fb58a998434fc1ee1eba2e1ec7b0a680eb44cfba3b7a85cc654e027d08666e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(usfm2osis) python39-usfm2osis python3dist(usfm2osis)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
