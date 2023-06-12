SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-authres-1.2.0-1.13.noarch.rpm"
RPM_HASH = "e42973fd4398e8f9aade9a61cacc0edeebac0676aac67f59350e3d5b0d8d662e53e38998a10b6b85d7ece7934e412c6f4ee849df6b30560d678a4a167a5335a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-authres \
python3.10dist(authres) \
python310-authres \
python3dist(authres)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
