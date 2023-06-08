SUMMARY = "German Online Banking Library"
DESCRIPTION = "A library of tools for German online banking implementing SEPA, IBAN/BIC, DETAUS and QIF."
LICENSE = "LGPL-3.0-only"

PV = "2.1.12"

RPM_NAME = "obantoo-2.1.12-4.6.noarch.rpm"
RPM_HASH = "75df754997639127c5b7c0a99496f08949f3292d78fbef3fe21489d152e69df8a9eda452b3b99a1166bce4c53829b0ede4238d72f20c6dfcf73a35c84d73a249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obantoo"
RDEPENDS:${PN} += ""

inherit rpm
