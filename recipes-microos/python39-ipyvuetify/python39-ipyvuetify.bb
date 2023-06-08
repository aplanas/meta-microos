SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python39-ipyvuetify-1.8.10-2.1.noarch.rpm"
RPM_HASH = "49c1942346922a54ed4f04d2c11a9be0833370b662df05bbc48eaf43c49ce2e71025b5020d548dcfc764970e75ac83589e5dd0f44e686c3edccf05f969868380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyvuetify) python39-ipyvuetify python3dist(ipyvuetify)"
RDEPENDS:${PN} += "(python39-ipyvue >= 1.7 with python39-ipyvue < 2) python(abi)"

inherit rpm
