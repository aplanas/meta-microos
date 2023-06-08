SUMMARY = "A general-purpose stream processing framework"
DESCRIPTION = "Aina is a general-purpose stream processing framework. It includes a \
templating system which powers a command line utility."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "python310-aina-0.1.3-4.9.noarch.rpm"
RPM_HASH = "33d5a0e70355e268dcc16eeb84a87c91c21c8ace9f6a79d24300020ef0f052ea921eeace1d0947ac669c05b1de5ea1e231bc2bb9289ab6bbfb2756f6973df62c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aina python3.10dist(aina) python310-aina python3dist(aina)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-base python310-click update-alternatives"

inherit rpm
