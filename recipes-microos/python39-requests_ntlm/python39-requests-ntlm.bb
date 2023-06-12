SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python39-requests_ntlm-1.2.0-2.1.noarch.rpm"
RPM_HASH = "54d9d9c4e807d13cde96f2bb586535696ffa9c00c3e34cec7cbcff15425abbbf5b0ba457d151394b7a5e254a3629bb7c658d1ff4199ab28f23927567a2f81eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-ntlm) python39-requests_ntlm python3dist(requests-ntlm)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-pyspnego python39-requests"

inherit rpm
