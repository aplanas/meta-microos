SUMMARY = "Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-publicsuffix-1.1.1-1.12.noarch.rpm"
RPM_HASH = "427ffe7df1638a6ea863ce6c80d4c21d2f8e08d92b4d0fefc80654252998527d409698505b0fa7f1f8027756d11242b77cdcce3aaa41284f77790f329ce97710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(publicsuffix) \
python311-publicsuffix \
python3dist(publicsuffix)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
