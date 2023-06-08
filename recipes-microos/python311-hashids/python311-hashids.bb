SUMMARY = "Python implementation of hashids"
DESCRIPTION = "Python implementation of hashids (http://www.hashids.org)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-hashids-1.3.1-1.18.noarch.rpm"
RPM_HASH = "2a8eff56c542f65afdc5e25cc6678bddd7068abfe4e1c80f9db678f2fc70d4ee6e8f71bff798f2f467c339557cdda93a54e52af248e8c87be692cc3db1b02c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hashids) python311-hashids python3dist(hashids)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
