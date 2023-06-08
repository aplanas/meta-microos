SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-ansel-1.0.0-2.1.noarch.rpm"
RPM_HASH = "150b4a8268a9f7da5a915e407e6e8d946a44f713531c9485d546e1a059f0cd1fd0525dcfb34ee22e6820215c1c6aa8017d1a944283e4b1feba3695ab15359959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ansel) python39-ansel python3dist(ansel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
