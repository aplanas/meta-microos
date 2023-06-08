SUMMARY = "Documentation for tidy and libtidy"
DESCRIPTION = "This package contains the documentation for both tidy and libtidy."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "tidy-doc-5.8.0-1.8.noarch.rpm"
RPM_HASH = "bc6ced661fc6ce0332bd4f19e15482cc82bad399a24ece5cb41cb0efb07727ec583cafb33a188cea35a580df3f8bc537a9d80d6d40784809c971359de0480f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tidy-doc"
RDEPENDS:${PN} += ""

inherit rpm
