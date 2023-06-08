SUMMARY = "Jupyter widgets based on vuetify UI components"
DESCRIPTION = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python310-ipyvuetify-1.8.10-2.1.noarch.rpm"
RPM_HASH = "689ca303e70900307886d2fabb8daa7cf67985735fb3fc298c9f1312881be6d603e2db42cf4fb5c93bbb63c1e7586ab72f524a955b5183884342f060d22c19b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvuetify python3.10dist(ipyvuetify) python310-ipyvuetify python3dist(ipyvuetify)"
RDEPENDS:${PN} += "(python310-ipyvue >= 1.7 with python310-ipyvue < 2) python(abi)"

inherit rpm
