SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-doc-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "f3cd6d06f150f5a84c24d853bfa28d906943f9d7d4ca22c7eb80f7aa7bc8b425c19b2ffcc98c4b46b69a0ac936624b8dfc63caed9932f56bf55d937735a17c0b"

RPROVIDES:${PN} += "openQA-doc openQA-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
