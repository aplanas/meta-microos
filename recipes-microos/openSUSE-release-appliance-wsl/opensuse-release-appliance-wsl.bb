SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-wsl-20230604-1684.1.aarch64.rpm"
RPM_HASH = "e851bab20955e50439d4c7cde4ef3568b85834165c52f54f7e29237c24414e8ff79349e030e4219910e751563008dfbd1422bf9b4c89e77d0c5cd6432ae2ff8b"

RPROVIDES:${PN} += "flavor(appliance-wsl) openSUSE-release-appliance-wsl openSUSE-release-appliance-wsl(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
