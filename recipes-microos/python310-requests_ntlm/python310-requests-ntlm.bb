SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python310-requests_ntlm-1.2.0-1.2.noarch.rpm"
RPM_HASH = "69bcce268dde21502656511d5fe24de5341841a5cfad3520a9d38f433b859e7655edc9c6deca2d7c784b05f3f88b253910b80248dc516f75e95c724f5639bc3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests_ntlm python3.10dist(requests-ntlm) python310-requests_ntlm python3dist(requests-ntlm)"
RDEPENDS:${PN} += "python(abi) python310-cryptography python310-pyspnego python310-requests"

inherit rpm
