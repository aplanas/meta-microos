SUMMARY = "Developer documentation for libzypp"
DESCRIPTION = "Developer documentation for libzypp."
LICENSE = "GPL-2.0+"

PV = "17.31.11"

RPM_NAME = "libzypp-devel-doc-17.31.11-1.1.aarch64.rpm"
RPM_HASH = "d3fa6dc0b092f771351b0c2c03ce942b0d781db9ab45c2f75ac5a422d8c930a900f42b668a2e4787bf62c1f7301349b1ce7b92a204d5ade12a1dd9b7a06ef724"

RPROVIDES:${PN} += "libzypp-devel-doc libzypp-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
