SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python310-requests_ntlm-1.2.0-2.1.noarch.rpm"
RPM_HASH = "688e5b0b57457d37d41210c5f7e7f675d3362df7beb2079c2a24da6687d0d6e6a67ac7c7a921e48550ac4113137a47f778cfbe6898d8a53ed525dce02ed0faa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests_ntlm python3.10dist(requests-ntlm) python310-requests_ntlm python3dist(requests-ntlm)"
RDEPENDS:${PN} += "python(abi) python310-cryptography python310-pyspnego python310-requests"

inherit rpm
