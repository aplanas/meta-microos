SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python311-requests_ntlm-1.2.0-1.2.noarch.rpm"
RPM_HASH = "73e100c89d8034abcadbe68c3c4dc3aeaba831e2027ccd4fd2a036fca308920650237e91b6abf0ba7ba6579ef7011a713ce8f8be9454dc5856dba8d38b973c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-ntlm) python311-requests_ntlm python3dist(requests-ntlm)"
RDEPENDS:${PN} += "python(abi) python311-cryptography python311-pyspnego python311-requests"

inherit rpm
