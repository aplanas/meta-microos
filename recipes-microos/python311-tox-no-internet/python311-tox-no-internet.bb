SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-tox-no-internet-0.1.0-1.14.noarch.rpm"
RPM_HASH = "1453a9e2eae1575478d11d21028fbbe5ef5603c0a360266504a4a1bf009cb74630062f9fbdb7f954df36d6139bbc29acbf02a9b84f418ee913a9400862ab5735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tox-no-internet) \
python311-tox-no-internet \
python3dist(tox-no-internet)"
RDEPENDS:${PN} += "python(abi) \
python311-tox"

inherit rpm
