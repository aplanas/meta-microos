SUMMARY = "Mycroft Skills Kit"
DESCRIPTION = "Mycroft Skills Kit python module."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-msk-0.4.0-1.4.noarch.rpm"
RPM_HASH = "71dacb2e601df67e436b2301d70f3725b4ad9ce617ac771e96f77806e75228444018a9149dc3a264efef719446a311e662efa8ff54d3a9702511fe957812384b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msk) python311-msk python3dist(msk)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-GitPython python311-PyGithub python311-msm update-alternatives"

inherit rpm
