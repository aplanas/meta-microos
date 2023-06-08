SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python311-keyrings.alt-4.0.2-1.11.noarch.rpm"
RPM_HASH = "7e310cbefa0238a96a516fc44c49a28fd96f8ccfb2bc7f0023dd299306ca016420424e9824b0474afa397fd590ffa78ebbba5b238ec47b920e403cfcbb0a975c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(keyrings.alt) python311-keyrings.alt python3dist(keyrings.alt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
