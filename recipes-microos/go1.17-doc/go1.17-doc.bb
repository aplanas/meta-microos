SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-doc-1.17.13-5.1.aarch64.rpm"
RPM_HASH = "14a6ea328b70c6b6273be0163fafc9884a23cd98efd5a7138bcc8baddc2191fb94d943de55221b1fd5720ed71224d829670ee2c226a96285631310c8199dbc46"

RPROVIDES:${PN} += "go-doc go1.17-doc go1.17-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
