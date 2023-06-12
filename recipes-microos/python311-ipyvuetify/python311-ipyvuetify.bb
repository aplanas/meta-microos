SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python311-ipyvuetify-1.8.10-2.2.noarch.rpm"
RPM_HASH = "a26255b1c655bc48a138da8b84c3a206de6d87449441968e43d340aa7668b8b6c7f806e11beeb6b11f2676c911366b7c8772773f75b9e50479f5b4ab76982208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyvuetify) python311-ipyvuetify python3dist(ipyvuetify)"
RDEPENDS:${PN} += "(python311-ipyvue >= 1.7 with python311-ipyvue < 2) python(abi)"

inherit rpm
