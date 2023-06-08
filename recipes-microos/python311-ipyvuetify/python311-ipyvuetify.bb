SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python311-ipyvuetify-1.8.10-2.1.noarch.rpm"
RPM_HASH = "2788b45a0f0c95ebafe97e533cd03a7119953b38ed668e3ca70f97576bbc73038851b32ac2ddcf57f8aadaa723ca973a55bd02e0e84fb31fc50c9bfd2e849187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyvuetify) python311-ipyvuetify python3dist(ipyvuetify)"
RDEPENDS:${PN} += "(python311-ipyvue >= 1.7 with python311-ipyvue < 2) python(abi)"

inherit rpm
