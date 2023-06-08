SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.16.1"

RPM_NAME = "python311-google-auth-2.16.1-3.1.noarch.rpm"
RPM_HASH = "ca88368451c80fcf3282a48eb7dd2d87437826fd7df5f271601a05b00d99cacdf8b8a51c73e11761779ffb54456b3e1607e72607e184fd63129b64bca5dc89be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-auth) python311-google-auth python3dist(google-auth)"
RDEPENDS:${PN} += "python(abi) python311-cachetools python311-cryptography python311-pyasn1-modules python311-rsa python311-setuptools python311-six"

inherit rpm
